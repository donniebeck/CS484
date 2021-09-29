package part_1;

import org.springframework.stereotype.Component;

@Component
public class MonthlyExpenses implements Expenses
{

	@Override
	public int getExpenses()
	{
		return 1500;
	}

}
