package assignmentone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp 
{

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student theStudent = context.getBean("myStudent", Student.class);
		
		System.out.println(theStudent.getTips());
		
		context.close();
		
	}

}
