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
import java.util.List;

public class AllProductsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            ProductsDao productsDao = new ProductsDaoImpl();
            List<Product> productsList = productsDao.getAllProducts();
            String str = "<html>\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <style>\n" +
                    "       table, td, th {" +
                    "           border: 1px solid black;" +
                    "           border-collapse: collapse;" +
                    "       }" +
                    "    </style>\n" +
                    "    <title>Все продукты</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<table>\n" +
                    "   <tr>\n" +
                    "        <th>id</th>\n" +
                    "        <th>name</th>\n" +
                    "        <th>factory</th>\n" +
                    "        <th>price</th>\n" +
                    "        <th>count</th>\n" +
                    "    </tr>\n";
            for (int i = 0; i < productsList.size(); i++) {
                Product product = productsList.get(i);
                String productRowStr = "<tr>\n";
                productRowStr += "<td>" + product.getId() + "</td>\n";
                productRowStr += "<td>" + product.getName() + "</td>\n";
                productRowStr += "<td>" + product.getFactory() + "</td>\n";
                productRowStr += "<td>" + product.getPrice() + "</td>\n";
                productRowStr += "<td>" + product.getCount() + "</td>\n";
                productRowStr += "</tr>\n";
                str += productRowStr;
            }
            str += "</table>\n";
            str += "</body>\n";
            str += "</html>";
            resp.setCharacterEncoding("UTF-8");
            resp.getWriter().write(str);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
