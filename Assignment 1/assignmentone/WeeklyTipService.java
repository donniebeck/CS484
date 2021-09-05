package assignmentone;

import java.util.Random;

public class WeeklyTipService implements TipService 
{

	@Override
	public String getTips() 
	{
		String tip;
		
		//Select a random number from 0-2
		Random rand = new Random();
		int rand_int = rand.nextInt(3);
		
		//Depending on the number generated, this statement changes String tip
		switch (rand_int) 
		{
			case 0:		tip = "Remember to study for your test next week!";
						break;
			case 1:		tip = "Don't skip class this week!";
						break;
			default:	tip = "Sorry! My sources are fuzzy, ask again later.";
						break;
		}
		
		return tip;
	}
	
	
	@Override
	public String getTipType() 
	{
		return "weekly";
	}
}
