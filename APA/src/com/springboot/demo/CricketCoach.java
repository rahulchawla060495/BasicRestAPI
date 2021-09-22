package com.springboot.demo;

import com.springboot.demo.Coach;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
   public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice for 6 only to win IPL";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public void getStartupMethod() {
		// TODO Auto-generated method stub
		System.out.println("Starting Services");
	}
	public void getCleanMethod() {
		// TODO Auto-generated method stub
		System.out.println("Cleaning Services");
	}

}
