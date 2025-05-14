package com.nimap.Assignment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nimap.Assignment.Entity.Category;
import com.nimap.Assignment.Entity.Product;
import com.nimap.Assignment.Exception.ResourceNotFoundException;
import com.nimap.Assignment.Repository.CategoryRepo;
import com.nimap.Assignment.Repository.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo productRepo;

	@Autowired
	private CategoryRepo categoryRepo;

	public Page<Product> getAllProducts(Pageable pageable) {
		return productRepo.findAll(pageable);
	}

	public Product getProductById(Long id) {
		return productRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
	}

	public Product createProduct(Product product) {
		if (product.getCategory() != null && product.getCategory().getId() != null) {
			Category category = categoryRepo.findById(product.getCategory().getId())
					.orElseThrow(() -> new ResourceNotFoundException(
							"Category not found with id: " + product.getCategory().getId()));
			product.setCategory(category);
		}
		return productRepo.save(product);
	}

	public Product updateProduct(Long id, Product productDetails) {
		Product product = productRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));

		product.setName(productDetails.getName());
		product.setDescription(productDetails.getDescription());
		product.setPrice(productDetails.getPrice());

		if (productDetails.getCategory() != null && productDetails.getCategory().getId() != null) {
			Category category = categoryRepo.findById(productDetails.getCategory().getId())
					.orElseThrow(() -> new ResourceNotFoundException(
							"Category not found with id: " + productDetails.getCategory().getId()));
			product.setCategory(category);
		}

		return productRepo.save(product);
	}

	public void deleteProduct(Long id) {
		if (!productRepo.existsById(id)) {
			throw new ResourceNotFoundException("Product not found with id: " + id);
		}
		productRepo.deleteById(id);
	}
}
