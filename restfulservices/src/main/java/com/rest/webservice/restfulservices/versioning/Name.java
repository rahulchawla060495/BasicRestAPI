package com.rest.webservice.restfulservices.versioning;

public class Name {
public String firstName;
public String lastName;
public Name(String firstName, String lastName) {
	//super();
	this.firstName = firstName;
	this.lastName = lastName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}


}
