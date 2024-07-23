package com.learn.springboot.jpa;

public interface IStudentDAO {
	public boolean save(final Student student);
	public Student fetch(final int studentId);
	public boolean delete(final int studentId);
	public boolean update(final Student student);
}
