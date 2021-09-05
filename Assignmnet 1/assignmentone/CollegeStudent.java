package assignmentone;

public class CollegeStudent implements Student
{
	
	TipService tipService;
	
	public CollegeStudent(TipService tipService)
	{
		this.tipService = tipService;
	}
	
	//This method also returns an additional line before the tip to show which config is set
	@Override
	public String getTips() 
	{
		return "Here's your " + tipService.getTipType() + " college tip!\n" + tipService.getTips();
	}

}
