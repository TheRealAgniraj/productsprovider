package com.deloitte.ta.productsprovider.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.deloitte.ta.productsprovider.model.Product;
import com.deloitte.ta.productsprovider.model.Products;

@Service
public class ProductsProviderServiceImpl implements ProductsProviderService {

	@Override
	public Products getProductsList() {
		Products products = new Products();

		List<Product> productList = new ArrayList<>();
		productList.add(new Product("1", "iPhone X", "mobiles", 20, 90000));
		productList.add(new Product("2", "Dairy Milk", "Chocolates", 50, 50));
		productList.add(new Product("3", "Dell Lattitude E7560", "Electronics", 20, 67500));
		productList.add(new Product("4", "American Tourister A89", "Bags", 10, 4390));
		productList.add(new Product("5", "Sonata SXD6", "Watches", 30, 2340));

		products.setProduct(productList);
		return products;
	}
}
