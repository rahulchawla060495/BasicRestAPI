package com.rest.webservice.restfulservices.user;

import java.util.Date;

public class ExceptionMessage {
private Date timestampofexception;
private String message;
private String details;
public ExceptionMessage(Date timestamp, String message, String details) {
	super();
	this.timestampofexception = timestamp;
	this.message = message;
	this.details = details;
}
public Date getTimestampofexception() {
	return timestampofexception;
}
//public void setTimestampofexception(Date timestampofexception) {
//	this.timestampofexception = timestampofexception;
//}
public String getMessage() {
	return message;
}
//public void setMessage(String message) {
//	this.message = message;
//}
public String getDetails() {
	return details;
}
//public void setDetails(String details) {
//	this.details = details;
//}

}
