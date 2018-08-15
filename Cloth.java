package com.company;

import java.math.BigDecimal;

public class Cloth extends Product {
    private int size;
    private String material;

    public Cloth(int id, String productName, BigDecimal price, double weight, String color, int productCount, int size, String material) {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }
}
