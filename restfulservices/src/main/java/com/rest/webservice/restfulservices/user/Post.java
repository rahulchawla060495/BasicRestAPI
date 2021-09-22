package com.rest.webservice.restfulservices.user;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Post {
@Id
@GeneratedValue
public int Id;
public String description;

@ManyToOne(fetch=FetchType.LAZY)
@JsonIgnore
User user;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

public void setUser(User user) {
	this.user=user;
}
@Override
public String toString() {
	return "Post [Id=" + Id + ", description=" + description + ", user=" + user + "]";
}

}
