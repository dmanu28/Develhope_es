package com.noirx.felix.service;

import java.util.List;

import com.noirx.felix.dto.CreateStudentDTO;
import com.noirx.felix.dto.ResponseStudentDTO;

public interface StudentService {

	public ResponseStudentDTO createStudent(CreateStudentDTO studentDto);
	public List<ResponseStudentDTO> getAll();
	public ResponseStudentDTO getStudentById(Integer id);
	public ResponseStudentDTO updateStudent(CreateStudentDTO studentDto, Integer id);
	public void deleteStudent(Integer id);
}
