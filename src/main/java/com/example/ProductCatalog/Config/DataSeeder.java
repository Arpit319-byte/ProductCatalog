package com.example.ProductCatalog.Config;

import com.example.ProductCatalog.Repository.CategoryRepository;
import com.example.ProductCatalog.Repository.ProductRepository;
import com.example.ProductCatalog.model.Category;
import com.example.ProductCatalog.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Delete all data
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        // Create a category
        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category food = new Category();
        food.setName("Food");

        categoryRepository.saveAll(Arrays.asList(electronics, clothing, food));

        // Create products
        Product phone=new Product();
        phone.setName("Samsung Galaxy S10");
        phone.setPrice(1000.00);
        phone.setCategory(electronics);
        phone.setDescription("Samsung Galaxy S10 is a great phone");
        phone.setImageUrl("https://www.google.com");

        Product laptop=new Product();
        phone.setName("Dell XPS 15");
        phone.setPrice(1000.00);
        phone.setCategory(electronics);
        phone.setDescription("Dell XPS 15 is a great laptop");
        phone.setImageUrl("https://www.google.com");

        Product shirt=new Product();
        phone.setName("Blue Shirt");
        phone.setPrice(1000.00);
        phone.setCategory(clothing);
        phone.setDescription("Blue Shirt is a great shirt");
        phone.setImageUrl("https://www.google.com");

        Product jeans=new Product();
        phone.setName("Blue Jeans");
        phone.setPrice(1000.00);
        phone.setCategory(clothing);
        phone.setDescription("Blue Jeans is a great jeans");
        phone.setImageUrl("https://www.google.com");

        Product pizza=new Product();
        phone.setName("Pepperoni Pizza");
        phone.setPrice(1000.00);
        phone.setCategory(food);
        phone.setDescription("Pepperoni Pizza is a great pizza");
        phone.setImageUrl("https://www.google.com");

        // Save products
        productRepository.saveAll(Arrays.asList(phone, laptop, shirt, jeans, pizza));
    }
}
