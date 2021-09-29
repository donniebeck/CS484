package part_2;

import org.springframework.stereotype.Component;

@Component
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
