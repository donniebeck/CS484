package assignmentone;

import java.util.Random;

public class DailyTipService implements TipService 
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
			case 0:		tip = "Check online for new assignments!";
						break;
			case 1:		tip = "Make sure to check your school email!";
						break;
			default:	tip = "Sorry! My sources are fuzzy, ask again later.";
						break;
		}
		
		return tip;
	}

	@Override
	public String getTipType()
	{
		return "daily";
	}

}
