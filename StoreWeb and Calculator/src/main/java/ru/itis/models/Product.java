package ru.itis.models;

public class Product {
    private int id;
    private String name;
    private String factory;
    private int price;
    private int count;

    public Product(int id, String name, String factory, int price, int count) {
        this.id = id;
        this.name = name;
        this.factory = factory;
        this.price = price;
        this.count = count;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", factory='" + factory + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
