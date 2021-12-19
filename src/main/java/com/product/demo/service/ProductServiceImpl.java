package com.product.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.product.demo.entity.Product;
import com.product.demo.repository.ProductRepository;
import com.product.demo.request.ProductRequest;

@Service
public class ProductServiceImpl implements ProductServiceIntr {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product createProduct(ProductRequest productRequest) {

		ObjectMapper objectMapper = new ObjectMapper();
		Product product = objectMapper.convertValue(productRequest, Product.class);
		return productRepository.save(product);
	}

	@Override
	public ResponseEntity<List<Product>> getMaxSoldProduct() {

		List<Product> op = (List<Product>) productRepository.getByQuantitySold();
		if (!op.isEmpty()) {
			return ResponseEntity.ok(op);
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}
