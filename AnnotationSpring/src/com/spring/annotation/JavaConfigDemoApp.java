package com.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.annotation.SecCoach;

public class JavaConfigDemoApp {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//load spring configuration file
		AnnotationConfigApplicationContext appcontext= new AnnotationConfigApplicationContext(SportsConfig.class);
//retrive bean from spring container
		SecCoach coach=appcontext.getBean("swimCoach",SecCoach.class);
		/*Scope testing start */
		SecCoach seccoach=appcontext.getBean("swimCoach",SecCoach.class);
		System.out.println("Result " +String.valueOf(coach == seccoach));
		/*Scope testing end*/
//call method of bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getEmailAddress());
		
//close context
		appcontext.close();
	}

}
