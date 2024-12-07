package com.example.ProductCatalog.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
AllArgsConstructor
@NoArgsConstructor
public class Category extends BaseClass {

    private String name;
    private Set<Product> products;
}
