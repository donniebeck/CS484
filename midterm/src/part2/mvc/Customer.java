package part2.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer
{
	//Not null and at least 5 char
	@NotNull(message="cannot be nothing, enter valid last name")
	@Size(min=5, message="more than five characters are required")
	private String name;
	
	//Phone number must start with 660, and be formatted like XXX-XXX-XXX, can be null
	@PhoneNumber
	@Pattern(regexp="^[0-9]{3}-[0-9]{3}-[0-9]{4}", message="must be formatted like XXX-XXX-XXXX")
	private String phoneNumber;
	
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	
}