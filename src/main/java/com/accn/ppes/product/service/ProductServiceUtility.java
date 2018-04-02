package com.accn.ppes.product.service;

import org.springframework.stereotype.Service;

import com.accn.ppes.product.entity.Product;

@Service
public class ProductServiceUtility implements ProductService {

	public Product findById(Long id) {
		Product product = new Product();
		product.setId(1L);
		product.setName("product");
		return product;
	}

	public Product save(Product product) {
		Product product1 = new Product();
		product.setId(1L);
		product.setName("product");
		return product1;
	}
}
