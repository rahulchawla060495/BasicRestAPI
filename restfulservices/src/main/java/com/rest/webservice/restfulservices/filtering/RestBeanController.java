package com.rest.webservice.restfulservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestBeanController {

	@GetMapping("/filtering")
	public RestBean getfilterData()
	{
		return new RestBean("value1","value2","value3");
	}
	
	@GetMapping("/filtering-list")
	public List<RestBean> getfilterListData()
	{
		return Arrays.asList(new RestBean("value1","value2","value3"),new RestBean("value11","value12","value13"));
	}
}
