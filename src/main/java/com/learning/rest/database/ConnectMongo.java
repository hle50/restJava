package com.learning.rest.database;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.bson.Document;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.learning.rest.model.Sample;
import com.learning.rest.service.SampleService;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;

public class ConnectMongo {

	public static MongoCollection<?> getDBConnection(){
		
		MongoClient client= new MongoClient("localhost", 27017);
		
		MongoDatabase database=client.getDatabase("usb");
 		return database.getCollection("product",DBObject.class);
		
	}
	public static List<Sample> sampleData (){
		List<Sample> list = new ArrayList<Sample>(); 
		List<String> comments = new ArrayList();
		comments.add("good");
		comments.add("not good");
		comments.add("very good");
		Sample sample1 = new Sample("Iphone", "p1.jpg", 249, comments);
		Sample sample2 = new Sample("Ipad", "p2.jpg", 349, comments);
		Sample sample3 = new Sample("Xiaomi Mi4", "p3.jpg", 449, comments);
		Sample sample4 = new Sample("Xiaomi Mi5", "p4.jpg", 549, comments);
		Sample sample5 = new Sample("Mipad", "p5.jpg", 149, comments);
		Sample sample6 = new Sample("BKPhone", "p6.jpg", 449, comments);
		Sample sample7 = new Sample("Z1", "p7.jpg", 459, comments);
		Sample sample8 = new Sample("Z20", "8.jpg", 479, comments);
		list.add(sample1);
		list.add(sample2);
		list.add(sample3);
		list.add(sample4);
		list.add(sample5);
		list.add(sample6);
		list.add(sample7);
		list.add(sample8);
		return list;
	}
	public static void main(String[] args) throws JsonProcessingException {
		
		MongoCollection<?> connection=ConnectMongo.getDBConnection();
	/*	Document doc = new Document("name", "MongoDB")
	               .append("type", "database")
	               .append("count", 1)
	               .append("info", new Document("x", 203).append("y", 102));
		connection.insertOne(doc);*/
		List<String> comments = new ArrayList();
		comments.add("good");
		comments.add("not good");
		comments.add("very good");
		Sample sample = new Sample("Iphone", "iphone.jps", 249, comments);
		ObjectMapper mapper = new ObjectMapper();
	

		//Object to JSON in String
	/*	String jsonInString = mapper.writeValueAsString(sample);
		DBObject bson = ( DBObject ) JSON.parse( jsonInString );
 		connection.insertOne(bson);*/
		/*for (int i = 0; i < ConnectMongo.sampleData().size(); i++) {
			Gson gson = new Gson();
	 		DBObject obj = (DBObject)JSON.parse(gson.toJson(ConnectMongo.sampleData().get(i)));
	 		connection.insertOne(obj);
		}*/
 		
		/*MongoCursor<?> cursor= connection.find().iterator();
		while(cursor.hasNext()) {
	        System.out.println(cursor.next());
	    }*/
		/*SampleService service = new SampleService();
		System.out.println(service.getDocuments().size());*/
		
	}
	
	
}
