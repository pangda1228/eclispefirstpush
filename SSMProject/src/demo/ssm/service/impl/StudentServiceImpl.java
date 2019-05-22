package demo.ssm.service.impl;

import demo.ssm.entity.Student;
import demo.ssm.mapper.StudentMapper;
import demo.ssm.service.StudentService;

public class StudentServiceImpl implements StudentService{

	private StudentMapper studentMapper;

	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}


	@Override
	public Student queryStudentById(int id) {
		return studentMapper.queryStudentById(id);
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
	}


}
