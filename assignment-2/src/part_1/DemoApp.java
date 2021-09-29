package part_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoApp
{

	public static void main(String[] args)
	{
		//create the container/object factory
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("part_1/applicationContext.xml");
		//retrieve the bean
		Person theDude = context.getBean("person", Person.class);
		//use the bean
		System.out.println("You got the " + theDude.getAwardName() + 
				"! It earned you $" + theDude.getAwardPrizeMondey() + ".");
		System.out.println("However, your current expenses are: $" +
				theDude.getExpenses() + ".");
		//close the container/object factory
		context.close();		
	}
}