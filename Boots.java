package com.company;

import java.math.BigDecimal;

public class Boots extends Product {
    private int size;
    private boolean isNaturalSkin;

    public Boots(int id, String productName, BigDecimal price, double weight, String color, int productCount, int size, boolean isNaturalSkin) {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public int getSize() {
        return size;
    }

    public boolean isNaturalSkin() {
        return isNaturalSkin;
    }
}
