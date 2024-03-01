package com.example.StudentCrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.StudentCrud.domain.Student;
import com.example.StudentCrud.repository.StudentRepository;

@Service
public class StudentService {

	private StudentRepository studentRepo;

	public StudentService(StudentRepository studentRepo) {
		this.studentRepo = studentRepo;
	}

	public List<Student> listAll() {
		return studentRepo.findAll();
	}

	public void save(Student std) {
		studentRepo.save(std);
	}

	public Student get(long id) {
		return studentRepo.findById(id).get();
	}

	public void delete(long id) {
		studentRepo.deleteById(id);
	}

}