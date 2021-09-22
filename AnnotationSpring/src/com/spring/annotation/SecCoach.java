package com.spring.annotation;

public interface SecCoach {
 public String getDailyWorkout();
 public String getDailyFortune();	
 default String getEmailAddress()
 {
	 return "No Email Applicable";
 }
 default String getTeam()
 {
	 return "No name given";
 }
}
