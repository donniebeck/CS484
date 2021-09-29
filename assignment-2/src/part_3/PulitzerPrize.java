package part_3;

public class PulitzerPrize implements Awards
{

	@Override
	public String getAwardName()
	{
		return "Pulitzer Prize";
	}

	@Override
	public int getAwardPrizeMoney()
	{
		return 15000;
	}

}
