package part1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("part1") //scan the part1 package for @Component
public class SpringConfig
{
	@Bean //A bean with a dependency injected into the constructor
	public FourYearCollege fourYearCollege()
	{
		return new FourYearCollege(trumanState());
	}
	
	@Bean //The dependency that the above bean relies on
	public University trumanState()
	{
		return new TrumanState();
	}
	
}
