package com.noirx.felix.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.noirx.felix.dto.CreateStudentDTO;
import com.noirx.felix.dto.ResponseStudentDTO;
import com.noirx.felix.service.implementation.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentController {

	private StudentServiceImpl studService;
	
	public StudentController(StudentServiceImpl studService) {
		this.studService = studService;
	}
	
	@PostMapping("/create")
	public ResponseStudentDTO createStudent (@RequestBody CreateStudentDTO request) {
		return studService.createStudent(request);
	}
	
	@GetMapping("/getAll")
	public List<ResponseStudentDTO> getAllStudents() {
		return studService.getAll();
	}
	
	@GetMapping("/get/{id}")
	public ResponseStudentDTO getStudentById(@PathVariable("id")Integer id) {
		return studService.getStudentById(id);
	}
	
	@PutMapping("/update/{id}")
	public ResponseStudentDTO updateStudentById(@PathVariable("id")Integer id, @RequestBody CreateStudentDTO request) {
		return studService.updateStudent(request, id);
	}
	
	@PutMapping("/updateStatus/{id}")
	public ResponseStudentDTO updateStatus(@PathVariable("id")Integer id, @RequestParam(name = "status")Boolean isWorking) {
		return studService.updateStatus(id, isWorking);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseStudentDTO> deleteById(@PathVariable("id")Integer id){
		studService.deleteStudent(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
