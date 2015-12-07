package com.learning.rest.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String imageUrl;
	private long price;
	private Date dateAdded;
	private List<String> comments;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public Sample(String name, String imageUrl, long price, List<String> comments) {
		super();
		this.name = name;
		this.imageUrl = imageUrl;
		this.price = price;
		this.comments = comments;
		this.dateAdded = new Date();

	}

	public Sample() {
		super();
	}

}
