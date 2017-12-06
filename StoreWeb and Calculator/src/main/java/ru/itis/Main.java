package ru.itis;

import ru.itis.Calculate.Calculator;
import ru.itis.dao.ProductsDao;
import ru.itis.dao.ProductsDaoImpl;
import ru.itis.models.Product;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
            ProductsDao dao = new ProductsDaoImpl();
        Calculator calculator = new Calculator();
        String str = dao.getProduct(1).toString();
        System.out.println(dao.getAllProducts());

    }

}