package com.springboot.demo;

import com.springboot.demo.Coach;

public class BasketBallCoach implements Coach{
    
	 private FortuneService fortuneservice;
	    
	    public BasketBallCoach(FortuneService theFortuneservice)
	    {
	    	fortuneservice = theFortuneservice;	
	    }
	@Override
	public String getDailyWorkout()
	{
		return "30 min spends on batting";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}
}
