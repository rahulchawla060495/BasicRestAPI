package com.rest.webservice.restfulservices.versioning;

public class PersonV1 {
public String name;

public PersonV1(String name) {
	//super();
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
