package com.company;

public class Product {
    String name;
    int price;
    String supplierName;

    public Product(String name, int price, String supplierName) {
        this.name = name;
        this.price = price;
        this.supplierName = supplierName;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public Product(String name) {
        this.name = name;
    }
}