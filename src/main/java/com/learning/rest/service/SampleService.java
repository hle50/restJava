package com.learning.rest.service;

import java.util.ArrayList;
import java.util.List;

import com.learning.rest.database.ConnectMongo;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

public class SampleService {

	MongoCollection<?> connection=ConnectMongo.getDBConnection();
	public String getDocuments(){
		List<String> list = new ArrayList();
		MongoCursor<?> cursor= connection.find().iterator();
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		while(cursor.hasNext()) {
	        builder.append(cursor.next().toString());
	        if (cursor.hasNext()) {
	        	builder.append(",");
			}
	    }
		builder.append("]");
		
		return builder.toString();
		
	}
}
