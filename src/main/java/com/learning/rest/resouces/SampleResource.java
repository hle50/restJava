package com.learning.rest.resouces;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.learning.rest.service.SampleService;

@Path("/sample")
public class SampleResource {
	SampleService sampleService = new SampleService();
	Gson gson = new Gson();
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getProduct() {	

		return sampleService.getDocuments();
	}
}
