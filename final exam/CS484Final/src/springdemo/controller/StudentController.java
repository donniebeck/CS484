package springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springdemo.entity.Student;
import springdemo.service.StudentService;

@Controller
public class StudentController
{
	@Autowired
	private StudentService service;
	
	//redirects to list
	@RequestMapping("/")
	public String showMyPage()
	{
		return "index";
	}
	
	//grab students from service, add to model, redirect to list
	@RequestMapping("/student/list")
	public String showForm(Model theModel)
	{
		
		List<Student> students = service.getAllStudents();
		theModel.addAttribute("students", students);
		return "list-students";
	}
	
	//create a new student, add it to the model, redirect to form
	@RequestMapping("student/showFormForAdd")
	public String addStudent(Model theModel)
	{
		Student tempStudent = new Student();
		theModel.addAttribute(tempStudent);
		return "student-form";
	}
	
	//grab student object from model, use service to upsert, redirect to list
	@RequestMapping("student/saveStudent")
	public String saveStudent(@ModelAttribute Student tempStudent)
	{
		service.addStudent(tempStudent);
		return "redirect:/";
	}
	
	//grab student id from url, use service to delete, redirect to list
	@RequestMapping("student/delete")
	public String deleteStudent(@RequestParam("studentId") int theId)
	{
		service.deleteStudent(theId);
		return "redirect:/";
	}
	
	//grab student id from url, add it to the model, redirect to form
	@RequestMapping("student/showFormForUpdate")
	public String updateStudent(@RequestParam("studentId") int theId, Model theModel)
	{
		Student tempStudent = service.getStudent(theId);
		theModel.addAttribute(tempStudent);
		return "student-form";
	}
	

}
