package com.packt.webstore.domain.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.webstore.domain.Product;

public interface ProductRepository {

	List<Product> getAllProducts();

	Product getProductById(String productId);

	List<Product> getProductsByCategory(String category);

	List<Product> getProductsByManufacturer(String manufacturer);

	List<Product> getProductsByPriceFilter(BigDecimal low, BigDecimal high);

	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);

	Set<Product> filterProducts(BigDecimal lowPrice, BigDecimal highPrice, String manufacturer, String category);

	void addProduct(Product product);

}
