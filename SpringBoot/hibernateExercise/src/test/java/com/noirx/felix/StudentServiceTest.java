package com.noirx.felix;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.noirx.felix.dto.CreateStudentDTO;
import com.noirx.felix.dto.ResponseStudentDTO;
import com.noirx.felix.service.implementation.StudentServiceImpl;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {

	@Mock
	private StudentServiceImpl studService;
	
	
	@Test
	 void testCreateStudent() {
		
		CreateStudentDTO request = TestUtil.giveTestRequest();
		ResponseStudentDTO response = TestUtil.giveTestResponse();
		
		Mockito.when(studService.createStudent(request)).thenReturn(response);
		
		ResponseStudentDTO myStudent = studService.createStudent(request);
		
		assertThat(myStudent).isNotNull();
		assertThat(myStudent).isEqualTo(response);
	}
	
	@Test
	void testGetAll() {
		ResponseStudentDTO response = TestUtil.giveTestResponse();
		List<ResponseStudentDTO>myList = TestUtil.giveTestList();
	
		Mockito.when(studService.getAll()).thenReturn(myList);
		List<ResponseStudentDTO> students = studService.getAll();
		assertThat(students).isNotEmpty()
		.hasOnlyElementsOfType(response.getClass()).hasSameElementsAs(myList);
	}
	
	@Test
	void testGetStudentById() {
		ResponseStudentDTO response = TestUtil.giveTestResponse();
		Integer id = TestUtil.giveTestRequest().getId();
		
		Mockito.when(studService.getStudentById(id)).thenReturn(response);
		ResponseStudentDTO myStudent = studService.getStudentById(id);
		assertThat(myStudent).isNotNull().isEqualTo(response);
	}
	
	@Test
	void testUpdateStudent() {
		CreateStudentDTO request = TestUtil.giveTestRequest();
		ResponseStudentDTO response = TestUtil.giveTestResponse();
		ResponseStudentDTO update = TestUtil.giveTestResponseUpdated();
		Integer id = TestUtil.giveTestRequest().getId();
		
		Mockito.when(studService.updateStudent(request, id)).thenReturn(update);
		ResponseStudentDTO myStudent = studService.updateStudent(request, id);
		assertThat(myStudent).isNotNull().isNotEqualTo(response).isEqualTo(update);
	}
	
	@Test
	void testDeleteStudent() {
		Integer id = 1;
		studService.deleteStudent(id);
		verify(studService).deleteStudent(id);
	}
}
