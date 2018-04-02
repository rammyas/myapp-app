package com.accn.ppes.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accn.ppes.product.entity.Product;
import com.accn.ppes.product.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	@Autowired
	private ProductService service;
	
	
	
	/**
	 * Fetching the OrderItems entity by it's orderId.
	 * 
	 * @param orderId
	 *            Long value that contains the id
	 * @return ResponseBody OrderItems
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Product byNumber(@PathVariable("id") Long id) {
		Product product = service.findById(id);
        return product;
	}
}
