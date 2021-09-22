package com.spring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("mySecCoach")
@Component
@Scope("prototype")
public class TennisCoach implements SecCoach,DisposableBean {

	//created using java reflection
	@Qualifier("sadFortuneService2")
	@Autowired
	private FortuneService2 fortuneService2;
	
	//autowired is not required when only one constructor available from spring 4.3
/*	@Autowired 
	public TennisCoach(FortuneService2 fortuneService2) {
		this.fortuneService2 = fortuneService2;
	}

	@Autowired
	public void setFortuneService2(FortuneService2 fortuneService2)
	{
		this.fortuneService2=fortuneService2;
	}
	*/
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "better to play with woodent racket";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService2.getFortune();
	}
	@PostConstruct
	public void doingstartup()
	{
	 System.out.println("starting startup services");	
	}
	
	@PreDestroy
	public void doingcleanup()
	{
	 System.out.println("cleaning cleanup services");	
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("auto destroy");
		
	}

}
