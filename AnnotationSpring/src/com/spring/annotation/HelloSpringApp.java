package com.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.annotation.SecCoach;

public class HelloSpringApp {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//load spring configuration file
		System.out.print(0.25f==0.25f);
		ClassPathXmlApplicationContext appcontext= new ClassPathXmlApplicationContext("applicationContext.xml");
//retrive bean from spring container
		SecCoach coach=appcontext.getBean("tennisCoach",SecCoach.class);
		/*Scope testing start */
		SecCoach seccoach=appcontext.getBean("tennisCoach",SecCoach.class);
		System.out.println(coach == seccoach);
		/*Scope testing end*/
//call method of bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
//close context
		appcontext.close();
	}

}
