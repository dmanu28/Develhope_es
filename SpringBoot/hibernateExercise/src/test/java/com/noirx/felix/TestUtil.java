package com.noirx.felix;

import java.util.ArrayList;
import java.util.List;

import com.noirx.felix.dto.CreateStudentDTO;
import com.noirx.felix.dto.ResponseStudentDTO;

public final class TestUtil {

	private TestUtil() {}
	
	static CreateStudentDTO giveTestRequest() {
		return CreateStudentDTO.builder()
				.id(1)
				.firstName("Milo")
				.lastName("Phoenix")
				.email("Mil@gmail.com")
				.isWorking(true)
				.build();
	}
	
	static ResponseStudentDTO giveTestResponse() {
		return ResponseStudentDTO.builder()
				.firstName("Milo")
				.lastName("Phoenix")
				.email("Mil@gmail.com")
				.isWorking(true)
				.build();
	}
	
	static ResponseStudentDTO giveTestResponseUpdated() {
		return ResponseStudentDTO.builder()
				.firstName("Yuji")
				.lastName("Itadori")
				.email("Jjk@gmail.com")
				.isWorking(false)
				.build();
	}
	
	static List<ResponseStudentDTO>giveTestList(){
		ResponseStudentDTO s1 = new ResponseStudentDTO("Afua", "Mensah", "af@gmail.com", true);
		ResponseStudentDTO s2 = new ResponseStudentDTO("Lee", "Arpha", "arm@gmail.com", true);
		List<ResponseStudentDTO> students =  new ArrayList<>();
		students.add(s1);
		students.add(s2);
		return students;
	}
}
