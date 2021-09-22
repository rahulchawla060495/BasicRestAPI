package com.springboot.demo;

import com.springboot.demo.Coach;

public class MyApp {

	public static void main(String[] args)
	{
		//create object
		Coach bsk=new TrackCoach();
		//use object
		System.out.println(bsk.getDailyWorkout());
	}
}
