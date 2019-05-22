package demo.ssm.service;

import demo.ssm.entity.Student;

public interface StudentService {
	public Student queryStudentById(int id);
	public void addStudent(Student student);
}
