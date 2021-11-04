package hibernate.demo.test;

import java.util.Scanner;

public class EmployeeDemoMainApp
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		showOptions();
		int option = keyboard.nextInt();
		keyboard.nextLine();
		while (option != 5)
		{
			switch (option)
			{
			case 1: //save
				System.out.print("First name: ");
				String firstName = keyboard.nextLine();
				 
				System.out.print("Last name: ");
				String lastName = keyboard.nextLine();
				 
				System.out.print("Company name: ");
				String companyName = keyboard.nextLine();
				 
				System.out.print("Join date (yyyy-MM-dd): ");
				String joinDate = keyboard.nextLine();
				 
				System.out.print("Salary: ");
				float salary = keyboard.nextFloat();
				 
				SaveEmployeeDemo saver = new SaveEmployeeDemo(firstName, lastName, companyName, joinDate, salary);
				saver.commit();
				
				showOptions();
				option = keyboard.nextInt();
				break;
			case 2: //retrieve by primary key
				System.out.print("emp_id of employee to be retrieved: ");
				int empIdFetch = keyboard.nextInt();
				
				ReadEmployeeByIDDemo fetcherId = new ReadEmployeeByIDDemo(empIdFetch);
				fetcherId.commit();
				
				showOptions();
				option = keyboard.nextInt();
				break;
			case 3: //retrieve by company name
				System.out.print("Company name of employee to be retrieved: ");
				String company = keyboard.nextLine();
				
				ReadEmployeeByCompany fetcherCompany = new ReadEmployeeByCompany(company);
				fetcherCompany.commit();
				
				showOptions();
				option = keyboard.nextInt();
				break;
			case 4: //delete employee by primary key
				System.out.print("emp_id of employee to be deleted: ");
				int empIdDelete = keyboard.nextInt();
				
				DeleteEmployeeDemo deleter = new DeleteEmployeeDemo(empIdDelete);
				deleter.commit();
				
				showOptions();
				option = keyboard.nextInt();
				break;
			default: 
				System.out.println("That wasn't a invalid input, please try again");
				showOptions();
				option = keyboard.nextInt();
				break;
			}
		}
		keyboard.close();
	}

	private static void showOptions()
	{
		System.out.println("Please select an option:");
		System.out.println("1. Save an employee");
		System.out.println("2. Retrieve an employee by primary key");
		System.out.println("3. Retrieve employees by company");
		System.out.println("4. Delete an employee record by primary key");
		System.out.println("5. Exit the program");
	}

}
