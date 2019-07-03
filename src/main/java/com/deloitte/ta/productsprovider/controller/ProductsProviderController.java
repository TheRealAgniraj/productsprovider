package com.deloitte.ta.productsprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.ta.productsprovider.model.Products;
import com.deloitte.ta.productsprovider.service.ProductsProviderService;

@RestController
public class ProductsProviderController {

	@Autowired
	ProductsProviderService service;

	@GetMapping("/getproductslist")
	public Products getProductsList() {
		return service.getProductsList();
	}
}
