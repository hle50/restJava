package com.learning.rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.learning.rest.database.DatabaseClass;
import com.learning.rest.model.Product;

public class ProductService {

private Map<Long,Product> products= DatabaseClass.getProducts();
	
	public ProductService(){
		products.put(1L, new Product(1, "Iphone", 600, "iphone.png"));
		products.put(2L, new Product(2, "Ipad", 500, "ipad.png"));
		products.put(3L, new Product(3, "Htc A9", 400, "a9.png"));
		products.put(4L, new Product(4, "Xiaomi Mi4", 200, "mi4.png"));
		products.put(5L, new Product(5, "Xiaomi Redminote 3", 200, "redminote3.png"));
	}
	public List<Product> getProducts(){
		return new ArrayList<Product>(products.values());
	}
	
	public Product getProduct(long id){
		return products.get(id);
	}
	
	public Product addProduct(Product product){
		product.setId(products.size()+1);
		products.put(product.getId(), product);
		return product;
	}
	
	public Product updateProduct(Product product){
		if (product.getId()<=0) {
			return null;
		}
		products.put(product.getId(), product);
		return product;
	}
	
	public Product remove(long id){
		return products.remove(id);
	}
}
