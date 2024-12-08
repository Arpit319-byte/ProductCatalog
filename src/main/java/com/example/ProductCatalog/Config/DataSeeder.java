package com.example.ProductCatalog.Config;

import com.example.ProductCatalog.Repository.CategoryRepository;
import com.example.ProductCatalog.Repository.ProductRepository;
import com.example.ProductCatalog.model.Category;
import com.example.ProductCatalog.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
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
        laptop.setName("Dell XPS 15");
        laptop.setPrice(1000.00);
        laptop.setCategory(electronics);
        laptop.setDescription("Dell XPS 15 is a great laptop");
        laptop.setImageUrl("https://www.google.com");

        Product shirt=new Product();
        shirt.setName("Blue Shirt");
        shirt.setPrice(1000.00);
        shirt.setCategory(clothing);
        shirt.setDescription("Blue Shirt is a great shirt");
        shirt.setImageUrl("https://www.google.com");

        Product jeans=new Product();
        jeans.setName("Blue Jeans");
        jeans.setPrice(1000.00);
        jeans.setCategory(clothing);
        jeans.setDescription("Blue Jeans is a great jeans");
        jeans.setImageUrl("https://www.google.com");

        Product pizza=new Product();
        pizza.setName("Pepperoni Pizza");
        pizza.setPrice(1000.00);
        pizza.setCategory(food);
        pizza.setDescription("Pepperoni Pizza is a great pizza");
        pizza.setImageUrl("https://www.google.com");

        // Save products
        productRepository.saveAll(Arrays.asList(phone, laptop, shirt, jeans, pizza));
    }
}
