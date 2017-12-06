package ru.itis.web;

import ru.itis.dao.ProductsDao;
import ru.itis.dao.ProductsDaoImpl;
import ru.itis.models.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class SaveProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String factory = req.getParameter("factory");
        String priNum = req.getParameter("price");
        String countNum = req.getParameter("count");
        int price = Integer.parseInt(priNum);
        int count = Integer.parseInt(countNum);
        Product product = new Product(name,factory,price,count);
        try {
            ProductsDao dao = new  ProductsDaoImpl();
            dao.addProduct(product);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.getWriter().write("Product added");



    }
}
