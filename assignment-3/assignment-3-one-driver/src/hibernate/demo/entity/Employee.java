package hibernate.demo.entity;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "employee")
public class Employee
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private int empId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="company")
	private String company;
	@Column(name="join_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar joinDate;
	@Column(name="salary")
	private float salary;
	
	public Employee() {}
	
	public Employee(String firstName, String lastName, String company, String joinDateString, float salary)
	{
		setFirstName(firstName);
		setLastName(lastName);
		setCompany(company);
		setJoinDate(parseStringToCalendar(joinDateString));
		setSalary(salary);
	}

	public int getEmpId()
	{
		return empId;
	}

	public void setEmpId(int empId)
	{
		this.empId = empId;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getCompany()
	{
		return company;
	}

	public void setCompany(String company)
	{
		this.company = company;
	}

	public Calendar getJoinDate()
	{
		return joinDate;
	}

	public void setJoinDate(Calendar joinDate)
	{
		this.joinDate = joinDate;
	}

	public float getSalary()
	{
		return salary;
	}

	public void setSalary(float salary)
	{
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String joinDateString = dateFormat.format(joinDate.getTime());
		return "employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", company="
				+ company + ", joinDate=" + joinDateString + ", salary=" + salary + "]";
	}
	
	public Calendar parseStringToCalendar(String joinDateString)
	{
		//Create calendar and dateformat
		Calendar joinDate = new GregorianCalendar();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		//Parse the string to calendar
		try
		{
			joinDate.setTime(dateFormat.parse(joinDateString));
		} catch (ParseException e)
		{
			System.out.println("An invalid time failed to parse to Calendar type");
		}
		return joinDate;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
