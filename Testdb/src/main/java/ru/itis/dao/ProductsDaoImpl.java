package ru.itis.dao;

import ru.itis.models.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductsDaoImpl implements ProductsDao {
    Connection c = null;

    public ProductsDaoImpl() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/test",
                        "root", "natalia2017");


    }

    @Override
    public Product getProduct(int id) throws ClassNotFoundException, SQLException {
        Statement stmt = c.createStatement();
        String sql = "SELECT * FROM shop WHERE id = " + id;
        ResultSet rs = stmt.executeQuery(sql);
        rs.next();
    String name = rs.getString("name");
    String factory = rs.getString("factory");
    int price = rs.getInt("price");
    int count = rs.getInt("count");
    Product product = new Product(id, name, factory, price, count);
        stmt.close();
        return product;
}

    @Override
    public List<Product> getAllProducts() throws ClassNotFoundException, SQLException {
        Statement stmt = c.createStatement();
        List<Product> productsList = new ArrayList<>();
        String sql = "SELECT * FROM shop ";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String factory = rs.getString("factory");
            int price = rs.getInt("price");
            int count = rs.getInt("count");
            Product product = new Product(id, name, factory, price, count);
            productsList.add(product);
        }
        stmt.close();
        return productsList;

    }

    @Override
    public List<Product> getProductByFactory(String factory) throws SQLException {
        List<Product> productsList = new ArrayList<>();
        String sql = "SELECT * FROM shop Where factory = " + factory;
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int price = rs.getInt("price");
            int count = rs.getInt("count");
            Product product = new Product(id, name, factory, price, count);
            productsList.add(product);
        }
        stmt.close();
        return productsList;
    }

    @Override
    public void addProduct(Product product) throws ClassNotFoundException, SQLException {
        Statement stmt = c.createStatement();

        String sql = "INSERT INTO shop (name, factory, price, count)\n" +
                "VALUES (" +product.getName()+", " + product.getFactory() + ", " + product.getPrice() + ", " + product.getCount() + ")" ;
        stmt.executeUpdate(sql);

        stmt.close();
    }


    @Override
    public void delete(int id)   throws ClassNotFoundException, SQLException {
        Statement stmt = c.createStatement();
        String sql = "DELETE  FROM shop WHERE id = " + id;
        stmt.executeUpdate(sql);
        stmt.close();

    }

    @Override
    public void update(Product product)   throws ClassNotFoundException, SQLException  {
        Statement stmt = c.createStatement();
        String sql = "UPDATE shop \n" +
                "SET name = " + product.getName() + ", factory = " + product.getFactory()
                + ", price =  " + product.getPrice() + ", count = " + product.getCount() + " \n" +
                " WHERE id = " + product.getId();
        stmt.executeUpdate(sql);
        stmt.close();

    }

    @Override
    public Integer getBidPrice(int[] id) throws ClassNotFoundException, SQLException {
        return null;
    }

}
