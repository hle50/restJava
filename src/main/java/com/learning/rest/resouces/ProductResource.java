package com.learning.rest.resouces;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.learning.rest.model.Product;
import com.learning.rest.service.ProductService;
@Path("product")
public class ProductResource {
	ProductService productService = new ProductService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProduct() {
		return productService.getProducts();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Product addProduct(Product product) {
		return productService.addProduct(product);
		
	}

	@GET
	@Path("/{productId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProductById(@PathParam("productId") long productId) {
		return productService.getProduct(productId);
	}
}
