package part_3;

public class Person
{
	private Awards award;
	private Expenses expenses; 
	
	public Person(Awards award, Expenses expenses)
	{
		this.award = award;
		this.expenses = expenses;
	}

	public String getAwardName()
	{
		return award.getAwardName();
	}
	
	public int getAwardPrizeMondey()
	{
		return award.getAwardPrizeMoney();
	}
	
	public int getExpenses()
	{
		return expenses.getExpenses();
	}
}
