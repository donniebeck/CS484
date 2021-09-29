package part_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringConfig
{
	@Bean //Shows dependency injection using @Bean
	public Person person()
	{
		return new Person(turingAward(), academicFees());
	}
	
	@Bean
	public Awards turingAward()
	{
		return new TuringAward();
	}
	
	@Bean
	public Awards pulitzerPrize()
	{
		return new PulitzerPrize();
	}
	
	
	@Bean
	public Expenses academicFees()
	{
		return new AcademicFees();
	}
	
	@Bean
	public Expenses monthlyExpenses()
	{
		return new MonthlyExpenses();
	}
	
	
}
