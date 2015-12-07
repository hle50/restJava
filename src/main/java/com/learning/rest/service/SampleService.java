package com.learning.rest.service;

import java.util.ArrayList;
import java.util.List;

import com.learning.rest.database.ConnectMongo;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

public class SampleService {

	MongoCollection<?> connection=ConnectMongo.getDBConnection();
	public List<Object> getDocuments(){
		List<Object> list = new ArrayList();
		MongoCursor<?> cursor= connection.find().iterator();
		while(cursor.hasNext()) {
	        list.add(cursor.next());
	    }

		return list;
		
	}
}
