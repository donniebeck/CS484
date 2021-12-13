package springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springdemo.dao.DataAccessObject;
import springdemo.entity.Student;

@Service
@Transactional
public class StudentService
{
	@Autowired
	private DataAccessObject dao;
	
	@Transactional
	public void addStudent(Student tempStudent)
	{
		dao.addStudent(tempStudent);
	}
	
	public Student getStudent(int theId)
	{
		return dao.getStudent(theId);
	}
	
	public Student updateStudent(Student tempStudent)
	{
		return dao.updateStudent(tempStudent);
	}
	
	@Transactional
	public void deleteStudent(int theId)
	{
		dao.deleteStudent(theId);
	}
	
	@Transactional
	public List<Student> getAllStudents()
	{
		return dao.getAllStudents();
	}

	public void setDataAccessObject(DataAccessObject dao)
	{
		this.dao = dao;
	}
}
