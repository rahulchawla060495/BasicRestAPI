package com.spring.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

public class SwimCoach implements SecCoach {
    private FortuneService2 fortuneService2;
    @Value("${foo.email}")
    private String Email;
    public SwimCoach(FortuneService2 fortuneService2)
    {
    	this.fortuneService2=fortuneService2;
    }
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "swim for 2 hrs";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService2.getFortune();
	}
	public String getEmailAddress()
	{
		return Email;
	}

}
