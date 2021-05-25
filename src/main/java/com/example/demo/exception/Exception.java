package com.example.demo.exception;

import java.util.Date;

public class Exception 
{
private Date timestamp;
private String message;
private String details;
@Override
public String toString() {
	return "Exception [timestamp=" + timestamp + ", message=" + message + ", details=" + details + "]";
}
public Date getTimestamp() {
	return timestamp;
}
public void setTimestamp(Date timestamp) {
	this.timestamp = timestamp;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}

}
