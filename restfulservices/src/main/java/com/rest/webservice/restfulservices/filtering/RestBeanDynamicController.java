package com.rest.webservice.restfulservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class RestBeanDynamicController {

	@GetMapping("/filter-dyn")
	public MappingJacksonValue getfilterData()
	{
		SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("field1","field2");
		FilterProvider filters=new SimpleFilterProvider().addFilter("RestBeanFilters", filter);
		MappingJacksonValue mapping=new MappingJacksonValue(new RestBean("value1","value2","value3"));
		mapping.setFilters(filters);
		return mapping;
	}
	
	@GetMapping("/filter-dyn-list")
	public MappingJacksonValue getfilterListData()
	{
		SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("field1","field3");
		FilterProvider filters=new SimpleFilterProvider().addFilter("RestBeanFilters", filter);
		MappingJacksonValue mapping=new MappingJacksonValue(Arrays.asList(new RestBean("value1","value2","value3"),new RestBean("value11","value12","value13")));
		mapping.setFilters(filters);
		return mapping;
	}
}
