package com.learn.springboot.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	IStudentDAO studentDAO;
	
	@Override
	public boolean save(Student student) {
		return studentDAO.save(student);
	}

	@Override
	public Student fetch(int studentId) {
		return studentDAO.fetch(studentId);
	}

	@Override
	public boolean delete(int studentId) {
		return studentDAO.delete(studentId);
	}

	@Override
	public boolean update(Student student) {
		return studentDAO.update(student);
	}

}
