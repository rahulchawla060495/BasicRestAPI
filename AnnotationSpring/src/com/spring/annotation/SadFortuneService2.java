package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService2 implements FortuneService2
{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is sad day for all";
	}

}
