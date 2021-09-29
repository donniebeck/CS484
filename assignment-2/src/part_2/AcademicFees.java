package part_2;

import org.springframework.stereotype.Component;

@Component
public class AcademicFees implements Expenses
{

	@Override
	public int getExpenses()
	{
		return 55000;
	}

}
