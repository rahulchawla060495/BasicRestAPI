package com.rest.webservice.restfulservices.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConrtoller {
@Autowired
MessageSource msgsource;

@GetMapping("/hello-world")
public String getHello()
{
	return "Hello Bhai";
}

@GetMapping("/hello-world-intern")
public String getHelloIntern(/*@RequestHeader(value="Accept-Language",required=false) Locale locale*/)
{
	return msgsource.getMessage("goodmorning.message", null,"default ur mornging and work", LocaleContextHolder.getLocale());
}

@GetMapping("/hello-world-bean")
public HelloBean getHelloBean()
{
	return new HelloBean("Hello Mere Bhai");
}

@GetMapping("/hello-world-bean/path/{named}")
public HelloBean getHelloBeanPath(@PathVariable(value="named") String name)
{
	return new HelloBean("Hello Mere bhai ".concat(name));
}

}
