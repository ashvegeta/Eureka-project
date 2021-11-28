package com.example.Ecommerce.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer cost;
    private String category;

    public Product(Long id, String name, Integer cost, String category) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.category = category;
    }
    public Product(String name, Integer cost, String category) {
        this.name = name;
        this.cost = cost;
        this.category = category;
    }
    public Product() {
    }
    @Override
    public String toString() {
        return "Product [category=" + category + ", cost=" + cost + ", id=" + id + ", name=" + name + "]";
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getCost() {
        return cost;
    }
    public void setCost(Integer cost) {
        this.cost = cost;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    
}
