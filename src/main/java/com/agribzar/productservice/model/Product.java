package com.agribzar.productservice.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "product") // Table will be created as 'product'
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String name;
    private String description;
    private int availableQuantity;
    private double percentage;

    @Column(name = "product_validity") // Correct DB column mapping
    private LocalDate productValidity;

    // Default constructor
    public Product() {}

    // Getters and Setters
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public LocalDate getProductValidity() {
        return productValidity;
    }

    public void setProductValidity(LocalDate productValidity) {
        this.productValidity = productValidity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", availableQuantity=" + availableQuantity +
                ", percentage=" + percentage +
                ", productValidity=" + productValidity +
                '}';
    }
}
