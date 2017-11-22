package ru.itis.dao;

import ru.itis.models.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductsDao {
    /**
     * возвращает продукт по id
     */
    Product getProduct(int id) throws ClassNotFoundException, SQLException;

    List<Product> getAllProducts() throws ClassNotFoundException, SQLException;

    List<Product> getProductByFactory(String factory) throws SQLException;

    void addProduct(Product product) throws ClassNotFoundException, SQLException;

    void delete(int id) throws ClassNotFoundException, SQLException;

    void update(Product product) throws ClassNotFoundException, SQLException;

    Integer getBidPrice(int [] id) throws ClassNotFoundException, SQLException;
}
