package com.springboot.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springboot.demo.Coach;

public class BeanScopeDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//load spring configuration file
		ClassPathXmlApplicationContext appcontext= new ClassPathXmlApplicationContext("beanscopeContext.xml");
//retrive bean from spring container
		Coach coach=appcontext.getBean("myCoach",Coach.class);
		Coach secCoach=appcontext.getBean("myCoach",Coach.class);
//call method of bean
		System.out.println(coach);
		System.out.println(secCoach);
		System.out.println(coach == secCoach);
//close context
		appcontext.close();
	}

}
