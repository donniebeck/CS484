package springdemo.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import springdemo.entity.Student;

@Repository
public class DataAccessObject
{
	@Autowired
	SessionFactory factory;
	
	public void addStudent(Student tempStudent)
	{
		factory.getCurrentSession().saveOrUpdate(tempStudent);
	}
	
	public Student getStudent(int theId)
	{
		Student tempStudent = factory.getCurrentSession().get(Student.class, theId);
		return tempStudent;
	}
	
	public Student updateStudent(Student tempStudent)
	{
		factory.getCurrentSession().update(tempStudent);
		return tempStudent;
	}
	
	public void deleteStudent(int theId)
	{
		Student tempStudent = factory.getCurrentSession().get(Student.class, theId);
		factory.getCurrentSession().delete(tempStudent);
	}
	
	
	public List<Student> getAllStudents()
	{
		@SuppressWarnings("unchecked") //I feel bad about this, but oh well
		List<Student> list = factory.getCurrentSession().createQuery("FROM Student").list();
		return list;
	}
	
	
}
