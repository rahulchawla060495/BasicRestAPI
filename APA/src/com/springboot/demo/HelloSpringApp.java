package com.springboot.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springboot.demo.Coach;

public class HelloSpringApp {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//load spring configuration file
		ClassPathXmlApplicationContext appcontext= new ClassPathXmlApplicationContext("applicationContext.xml");
//retrive bean from spring container
		Coach coach=appcontext.getBean("myCoach",Coach.class);
//call method of bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeam());
//close context
		appcontext.close();
	}

}
