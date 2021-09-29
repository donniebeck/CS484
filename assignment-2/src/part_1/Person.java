package part_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person
{
	@Autowired //Field injection
	private Expenses expenses; 
	
	private Awards award;

	public int getExpenses()
	{
		return expenses.getExpenses();
	}
	
	@Autowired //Setter injection
	public void setAward(Awards award)
	{
		this.award = award;
	}

	public String getAwardName()
	{
		return award.getAwardName();
	}
	
	public int getAwardPrizeMondey()
	{
		return award.getAwardPrizeMoney();
	}
}
