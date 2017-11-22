package ru.itis;

import ru.itis.dao.ProductsDao;
import ru.itis.dao.ProductsDaoImpl;
import ru.itis.models.Product;

import java.sql.SQLException;


import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ProductsDao dao = new ProductsDaoImpl();
        Product products = new Product(12,"'Chocolate '", "'OOO.MilkChocolateFactory 48'", 80, 100);
        dao.update(products);
        System.out.println(dao.getAllProducts());

    }
}
