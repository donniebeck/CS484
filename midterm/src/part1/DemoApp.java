package part1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class DemoApp
{

	public static void main(String[] args)
	{
		//create the container/object factory
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SpringConfig.class);
		//retrieve the bean
		FourYearCollege theSchool = context.getBean("fourYearCollege", FourYearCollege.class);
		//use the bean
		System.out.println("president: " +  theSchool.getPresident());
		System.out.println("university: " + theSchool.getUniversityName());
		//close the container/object factory
		context.close();		
	}
}