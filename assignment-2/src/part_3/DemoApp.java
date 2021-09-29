package part_3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class DemoApp
{

	public static void main(String[] args)
	{
		//create the container/object factory
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SpringConfig.class);
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