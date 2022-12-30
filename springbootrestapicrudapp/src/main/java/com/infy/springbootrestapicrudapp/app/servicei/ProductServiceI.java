package com.infy.springbootrestapicrudapp.app.servicei;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.infy.springbootrestapicrudapp.app.model.Product;

public interface ProductServiceI {
	public Product saveProduct(Product p);
	public Iterable<Product> getProducts();
	public void deleteProducts( Integer productId);
	public Product updateProducts(Integer productId, Product p);
//	public Product getById(Integer productId, Product p);
}
