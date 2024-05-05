package com.noirx.felix;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doNothing;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.noirx.felix.dto.CreateStudentDTO;
import com.noirx.felix.dto.ResponseStudentDTO;
import com.noirx.felix.service.implementation.StudentServiceImpl;

@SpringBootTest
@AutoConfigureMockMvc
 class StudentControllerTest {

	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private StudentServiceImpl studService;
	@Autowired
	ObjectMapper objMapper;
	
	@Test
	void testCreateStudent() throws Exception {
		CreateStudentDTO req = TestUtil.giveTestRequest();
		ResponseStudentDTO resp = TestUtil.giveTestResponse();
		Mockito.when(studService.createStudent(req)).thenReturn(resp);
		
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/student/create")
				.contentType(org.springframework.http.MediaType.APPLICATION_JSON)
				.content(objMapper.writeValueAsString(req)))
				.andDo(print())
				.andExpect(status().isOk()).andReturn();
		
		String responseContent = mvcResult.getResponse().getContentAsString();
		ResponseStudentDTO responseStudent = new ObjectMapper().readValue(responseContent, ResponseStudentDTO.class);
		
		assertThat(responseStudent).isNotNull().isEqualTo(resp);
		assertThat(responseStudent.getFirstName()).isEqualTo(resp.getFirstName());
	}
	
	@Test
	void testGetAllStudents() throws Exception {
		List<ResponseStudentDTO> myList = TestUtil.giveTestList();
		Mockito.when(studService.getAll()).thenReturn(myList);
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/student/getAll"))
				.andExpect(status().isOk())
				.andDo(print())
				.andReturn();
		
		String response = mvcResult.getResponse().getContentAsString();
		List<ResponseStudentDTO> resultList =  new ObjectMapper().readValue(response, List.class);
		assertThat(resultList).isNotEmpty().hasSameSizeAs(TestUtil.giveTestList());
				
			
	}
	
	@Test
	void testGetStudentById() throws Exception {
		Integer id = TestUtil.giveTestRequest().getId();
		ResponseStudentDTO resp = TestUtil.giveTestResponse();
		Mockito.when(studService.getStudentById(id)).thenReturn(resp);
		
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/student/get/{id}", "1"))
				.andExpectAll(status().isOk())
				.andDo(print())
				.andReturn();
		
		String responseContent = mvcResult.getResponse().getContentAsString();
		ResponseStudentDTO result = objMapper.readValue(responseContent, ResponseStudentDTO.class);
		
		assertThat(result).isNotNull().isEqualTo(resp);
		assertThat(result.getFirstName()).contains("Milo");
	}
	
	@Test
	void testUpdateStudentById() throws JsonProcessingException, Exception {
		CreateStudentDTO request = TestUtil.giveTestRequest();
		Integer id = TestUtil.giveTestRequest().getId();
		ResponseStudentDTO response = TestUtil.giveTestResponse();
		ResponseStudentDTO updateResponse = TestUtil.giveTestResponseUpdated();
		
		Mockito.when(studService.updateStudent(request, id)).thenReturn(updateResponse);
		
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.put("/student/update/{id}", "1")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objMapper.writeValueAsString(request)))
				.andDo(print())
				.andExpectAll(status().isOk())
				.andReturn();
		
		String responseContent = mvcResult.getResponse().getContentAsString();
		ResponseStudentDTO result = new ObjectMapper().readValue(responseContent, ResponseStudentDTO.class);

		assertThat(result).isNotNull().isNotEqualTo(response)
		.hasFieldOrPropertyWithValue("firstName", TestUtil.giveTestResponseUpdated().getFirstName());
		
	}
	
	@Test
	void testDeleteById() throws Exception {
		Integer id = TestUtil.giveTestRequest().getId();
		doNothing().when(studService).deleteStudent(id);
		this.mockMvc.perform(MockMvcRequestBuilders.delete("/student/delete/{id}", "1"))
				.andExpect(status().isNoContent())
				.andDo(print())
				.andReturn();
	}
	
}
