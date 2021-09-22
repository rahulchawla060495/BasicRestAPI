package com.rest.webservice.restfulservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping("/v1/person")
	public PersonV1 URIProductV1()
	{
		return new PersonV1("MADHAV CHAWLA");
	}
	@GetMapping("/v2/person")
	public PersonV2 URIProductV2()
	{
		return new PersonV2(new Name("MADHAV","CHAWLA"));
	}
	@GetMapping(value="/person/param",params="version=1")
	public PersonV1 ParamProductV1()
	{
		return new PersonV1("MADHAV CHAWLA");
	}
	@GetMapping(value="/person/param",params="version=2")
	public PersonV2 ParamProductV2()
	{
		return new PersonV2(new Name("MADHAV","CHAWLA"));
	}
	@GetMapping(value="/person/header",headers="X-VERSION=1")
	public PersonV1 HeaderProductV1()
	{
		return new PersonV1("MADHAV CHAWLA");
	}
	@GetMapping(value="/person/header",headers="X-VERSION=2")
	public PersonV2 HeaderProductV2()
	{
		return new PersonV2(new Name("MADHAV","CHAWLA"));
	}
	@GetMapping(value="/person/produces",produces="application/v1+json")
	public PersonV1 ProduceProductV1()
	{
		return new PersonV1("MADHAV CHAWLA");
	}
	@GetMapping(value="/person/produces",produces="application/v2+json")
	public PersonV2 ProduceProductV2()
	{
		return new PersonV2(new Name("MADHAV","CHAWLA"));
	}
}
