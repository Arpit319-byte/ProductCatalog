package com.example.ProductCatalog.Service;

import com.example.ProductCatalog.Repository.CategoryRepository;
import com.example.ProductCatalog.model.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final static Logger logger = LoggerFactory.getLogger(CategoryService.class);

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    public List<Category> getAllCategories() {
        logger.info("Getting all categories");
        return categoryRepository.findAll();
    }

}
