package part2.mvc;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
public class PhoneNumberConstraintValidator
implements ConstraintValidator<PhoneNumber, String> 
{
	private String areaCode;
	@Override
	public void initialize(PhoneNumber theNumber) 
	{
		areaCode = theNumber.value();
	}
	@Override
	public boolean isValid(String theCode,
	ConstraintValidatorContext theConstraintValidatorContext) 
	{
		boolean result;
		if (theCode != null) 
		{
			result = theCode.startsWith(areaCode);
		}
		else 
		{
			//this allows for a null phonenumber to get through
			result = true;
		}
		return result;
	}
}