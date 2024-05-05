package com.noirx.felix.service.implementation;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.noirx.felix.dto.CreateStudentDTO;
import com.noirx.felix.dto.ResponseStudentDTO;
import com.noirx.felix.dto.mapper.StudentMapper;
import com.noirx.felix.entity.Student;
import com.noirx.felix.exception.StudentNotFoundException;
import com.noirx.felix.repository.StudentRepo;
import com.noirx.felix.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepo studRepo;
	private StudentMapper studMapper;
	
	public StudentServiceImpl(StudentRepo studRepo, StudentMapper studMapper) {
		this.studRepo = studRepo;
		this.studMapper = studMapper;
	}
	@Override
	public ResponseStudentDTO createStudent(CreateStudentDTO studentDto) {
		Student student = studMapper.mapToEntity(studentDto);
		Student savedStudent = studRepo.save(student);
		return studMapper.mapToResponse(savedStudent);
	}

	@Override
	public List<ResponseStudentDTO> getAll() {
		return studRepo.findAll().stream()
				.map(e-> studMapper.mapToResponse(e))
				.collect(Collectors.toList());
	}

	@Override
	public ResponseStudentDTO getStudentById(Integer id) {
		Optional<Student> student = studRepo.findById(id);
		if(student.isEmpty()) {
			throw new StudentNotFoundException(id);
		}
		Student foundStudent = student.get();
		return studMapper.mapToResponse(foundStudent);
	}

	@Override
	public ResponseStudentDTO updateStudent(CreateStudentDTO studentDto, Integer id) {
		Optional<Student> student = studRepo.findById(id);
		if(student.isEmpty()) {
			throw new StudentNotFoundException(id);
		}
		Student updatable = student.get();
		updatable.setFirstName(studentDto.getFirstName());
		updatable.setLastName(studentDto.getLastName());
		updatable.setEmail(studentDto.getEmail());
		updatable.setIsWorking(studentDto.getIsWorking());
		
		return studMapper.mapToResponse(studRepo.save(updatable));
	}
	
	public ResponseStudentDTO updateStatus(Integer id, Boolean isWorking) {
		Optional<Student> student = studRepo.findById(id);
		if(student.isEmpty()) {
			throw new StudentNotFoundException(id);
		}
		Student updatable = student.get();
		updatable.setIsWorking(isWorking);
		return studMapper.mapToResponse(studRepo.save(updatable));
	}

	@Override
	public void deleteStudent(Integer id) {
		studRepo.deleteById(id);
	}

}
