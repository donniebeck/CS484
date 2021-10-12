package part1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FourYearCollege
{
	@Autowired //Showing field injection using autowired
	private Person person;
	
	private University university;
	
	public FourYearCollege(University university)
	{
		this.university = university;
	}
	
	public String getPresident()
	{
		return person.getPersonName();
	}

	public String getUniversityName()
	{
		return university.getUniversityName();
	}
}
