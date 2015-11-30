package com.learning.rest.database;

import java.util.HashMap;
import java.util.Map;

import com.learning.rest.model.Message;
import com.learning.rest.model.Product;
import com.learning.rest.model.Profile;

public class DatabaseClass {

	private static Map<Long,Message> messages =new HashMap<Long,Message>();
	private static Map<Long,Profile> profiles =new HashMap<Long,Profile>();
	private static Map<Long,Product> products =new HashMap<Long,Product>();
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}
	public static Map<Long, Product> getProducts() {
		return products;
	}
}
