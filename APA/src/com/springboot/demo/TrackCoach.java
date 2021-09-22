package com.springboot.demo;

import com.springboot.demo.Coach;

public class TrackCoach implements Coach {
    private FortuneService fortuneservice;
    
    public TrackCoach()
    {
    	
    }
    public TrackCoach(FortuneService theFortuneservice)
    {
    	fortuneservice = theFortuneservice;	
    }
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "30 Minutes tracking";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}



}
