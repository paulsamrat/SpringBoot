package com.learn.springboot.jpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements IStudentDAO {
	
	@Autowired
	IStudentRepo studentRepo;
	
	@Override
	public boolean save(Student student) {
		// TODO Auto-generated method stub
		final Student obj = studentRepo.saveAndFlush(student);
		return obj == null;
	}

	@Override
	public Student fetch(int studentId) {
		Optional<Student> response = studentRepo.findById(studentId);
		return response.isPresent() ? response.get() : null;
	}

	@Override
	public boolean delete(int studentId) {
		studentRepo.deleteById(studentId);
		return true;
	}

	@Override
	public boolean update(Student student) {
		final Student obj = studentRepo.saveAndFlush(student);
		return obj == null;
	}

}
