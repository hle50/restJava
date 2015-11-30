package com.learning.rest.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private long id;
	private Date created;
	private String author;
	private String message;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getCreated() {
		return created;
	}
	public Message(long id, String author, String message) {
		super();
		this.id = id;
		this.author = author;
		this.message = message;
		this.created=new Date();
	}
	public Message() {
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
