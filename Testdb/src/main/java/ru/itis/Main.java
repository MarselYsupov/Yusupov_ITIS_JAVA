package ru.itis;

import ru.itis.dao.ProductsDao;
import ru.itis.dao.ProductsDaoImpl;
import ru.itis.models.Product;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ProductsDao dao = new ProductsDaoImpl();
//        Product products = new Product(2,"'Milk'", "'MilkFactory 3'", 60,5);
//        dao.update(products);
         dao.updateDiscount(10,"'MilkFactory 3'");
        System.out.println(dao.getAllProducts());

    }

}
