package part_3;

public class TuringAward implements Awards
{

	@Override
	public String getAwardName()
	{
		return "Turing Award";
	}

	@Override
	public int getAwardPrizeMoney()
	{
		return 1000000;
	}

}
