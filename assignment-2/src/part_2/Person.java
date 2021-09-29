package part_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person
{
	@Autowired //Field injection using qualifier
	@Qualifier("academicFees")
	private Expenses expenses; 
	
	private Awards award;

	public int getExpenses()
	{
		return expenses.getExpenses();
	}
	
	@Autowired //Setter injection using qualifier
	@Qualifier("turingAward")
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
