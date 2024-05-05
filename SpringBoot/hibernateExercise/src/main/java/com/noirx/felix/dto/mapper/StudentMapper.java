package com.noirx.felix.dto.mapper;

import org.springframework.stereotype.Component;

import com.noirx.felix.dto.CreateStudentDTO;
import com.noirx.felix.dto.ResponseStudentDTO;
import com.noirx.felix.entity.Student;

@Component
public class StudentMapper {

	public Student mapToEntity(CreateStudentDTO studentDto) {
		return Student.builder()
				.id(studentDto.getId())
				.firstName(studentDto.getFirstName())
				.lastName(studentDto.getLastName())
				.email(studentDto.getEmail())
				.isWorking(studentDto.getIsWorking())
				.build();
	}
	
	public ResponseStudentDTO mapToResponse(Student student) {
		return ResponseStudentDTO.builder()
				.firstName(student.getFirstName())
				.lastName(student.getLastName())
				.email(student.getEmail())
				.isWorking(student.getIsWorking())
				.build();
	}
}
