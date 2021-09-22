package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService2 implements FortuneService2 {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Your today fortune is lucky";
	}

}
