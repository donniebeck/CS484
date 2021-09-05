package assignmentone;

public class HighSchoolStudent implements Student
{
	
	TipService tipService;
	
	public HighSchoolStudent(TipService tipService)
	{
		this.tipService = tipService;
	}
	
	//This method also returns an additional line before the tip to show which config is set
	@Override
	public String getTips() 
	{
		return "Here's your " + tipService.getTipType() + " high school tip!\n" + tipService.getTips();
	}

}
