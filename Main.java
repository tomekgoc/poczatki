package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	Product product = new Product.Builder()
                          .setId(1)
                          .setProductName("koszula")
                          .setPrice(new BigDecimal("4.99"))
                          .setWeight(0.22)
                          .setColor("czerwony")
                          .setProductCount(1)
                          .build();
	System.out.println(product);
    }
}
