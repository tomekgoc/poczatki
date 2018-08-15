package com.company;

import java.math.BigDecimal;


public class Product {
    private int id;
    private String productName;
    private BigDecimal price;
    private double weight;
    private String color;
    private int productCount;

     public Product(int id, String productName, BigDecimal price, double weight, String color, int productCount) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.productCount = productCount;
    }

    public static class Builder {
        private int id;
        private String productName;
        private BigDecimal price;
        private double weight;
        private String color;
        private int productCount;

        public Builder() {
        }

        private Builder setId(int id) {
            this.id = id;
            return this;
        }

        private Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        private Builder setPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        private Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        private Builder setColor(String color) {
            this.color = color;
            return this;
        }

        private Builder setProductCount(int productCount) {
            this.productCount = productCount;
            return this;
        }

        private Product build() {
            return new Product(id, productName, price, weight, color, productCount);
        }
    }

    public int getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
}
