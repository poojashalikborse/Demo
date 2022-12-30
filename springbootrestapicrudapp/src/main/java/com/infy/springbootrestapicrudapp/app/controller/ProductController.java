package com.infy.springbootrestapicrudapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.infy.springbootrestapicrudapp.app.model.Product;
import com.infy.springbootrestapicrudapp.app.servicei.ProductServiceI;


@RestController
@RequestMapping(value="/api")
public class ProductController {
	@Autowired
	ProductServiceI psi;
	

	//POSTAPI
	@PostMapping(value="/product")
	public Product saveProduct(@RequestBody Product p) {
		Product product = psi.saveProduct(p);                                                                                   
		return product;
	}
	
	@GetMapping(value="/products")
	public Iterable<Product> getProducts(){
		Iterable<Product> product = psi.getProducts();
		return product;
	}

	@DeleteMapping(value = "/product/{productId}")
	public void deleteProducts(@PathVariable Integer productId) {
		psi.deleteProducts(productId);
		
	}
	@PutMapping(value="/product/{productId}")
	public Product updateProducts(@PathVariable Integer productId,@RequestBody Product p)
	{
		Product product = psi.updateProducts(productId,p);
		return product;
	}
	
//	@GetMapping(value="/product/{productId}")
//	public Product getById(@PathVariable Integer productId,@RequestBody Product p) {
//		Product product = psi.getById(productId,p);
//		return product;
//	
	//}
	
} 
