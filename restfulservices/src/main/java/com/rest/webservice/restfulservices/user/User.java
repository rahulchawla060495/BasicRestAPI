package com.rest.webservice.restfulservices.user;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@Entity
public class User {
   
   @Id
   @GeneratedValue
   private int id;
   @Size(min=2, message = "Minimum 2 character is needed for user name")
   private String name;
   @Past
   private Date dob;
   @OneToMany(mappedBy = "user")
   List<Post> posts;

public List<Post> getPosts() {
	return posts;
}
public void setPosts(List<Post> posts) {
	this.posts = posts;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}

public User(int id, String name, Date dob) {
	//super();
	this.id = id;
	this.name = name;
	this.dob = dob;
}

public User() {
	
}

   
   
   

}
