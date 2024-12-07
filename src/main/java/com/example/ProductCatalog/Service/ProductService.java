package com.example.ProductCatalog.Service;

import com.example.ProductCatalog.Repository.ProductRepository;
import com.example.ProductCatalog.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final static Logger logger = LoggerFactory.getLogger(ProductService.class);

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        logger.info("Getting all products");
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        logger.info("Getting product by id: {}", id);
        return productRepository.findById(id).orElse(null);
    }
}
