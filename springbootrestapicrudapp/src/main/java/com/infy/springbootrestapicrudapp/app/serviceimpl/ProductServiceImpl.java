package com.infy.springbootrestapicrudapp.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.hibernate.mapping.List;
import com.infy.springbootrestapicrudapp.app.model.Product;
import com.infy.springbootrestapicrudapp.app.repositary.ProductRepository;
import com.infy.springbootrestapicrudapp.app.servicei.ProductServiceI;

@Service
public class ProductServiceImpl implements ProductServiceI{
	@Autowired
	ProductRepository pr;
	@Override
	public Product saveProduct(Product p) {
		return pr.save(p);
	}
	@Override
	public Iterable<Product> getProducts(){
		return pr.findAll();
	}
	@Override
	public void deleteProducts( Integer productId) {
		pr.deleteById(productId);
	}
	
	@Override
	public Product updateProducts(Integer productId, Product p)
	{
		return pr.save(p);  
	}
//	@Override
//	public Product getById(Integer productId, Product p)
//	{
//		return pr.findById(productId,p);
//	}
}
