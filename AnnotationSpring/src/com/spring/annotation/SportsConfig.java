package com.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("com.spring.annotation")
@PropertySource("classpath:sports.properties")
public class SportsConfig {
	//define bean for sadfortune service
	@Bean
	public FortuneService2 sadFortune()
	{
		return new SadFortuneService2();
	}
	
	//define bean for swim Coach
    @Bean
    //@Scope("prototype")
	public SecCoach swimCoach()
    {
    	SwimCoach sc = new SwimCoach(sadFortune());
    			return sc;
    }
}
