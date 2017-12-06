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

public class ProductServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        int productId = Integer.parseInt(id);


        try {
            ProductsDao dao = new ProductsDaoImpl();
            Product product = dao.getProduct(productId);
            String str2 = product.toString();
            String str = "<html>\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>First page</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<h1>Продукты"+  str2 + "</h1>";
            resp.getWriter().write(str);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }





    }


}
//    String id = req.getParameter("id");
//    int productId = Integer.parseInt(id);
//
//        try {
//                ProductsDao dao = new ProductsDaoImpl();
//                Product product = dao.getProduct(productId);
//                resp.setContentType("text/html");
//                PrintWriter out = resp.getWriter();
//                out.println("<html>");
//                out.println("<head>");
//                out.println("<title>Hola</title>");
//                out.println("</head>");
//                out.println("<body bgcolor=\"white\">");
//                out.println("<h1>Продукт= "+ product.toString() + "</h1>");
//                out.println("</body>");
//                out.println("</html>");
//
//                String  str = "<html>\n" +
//                "<head>\n" +
//                "    <meta charset=UTF-8>\n" +
//                "    <title>First page</title>\n" +
//                "</head>\n" +
//                "<body>\n" +
//                "<h1>Продукт="+ product.toString() + "</h1>\n" +
//
//                "</body>\n" +
//                "</html>\n";
//                resp.getWriter().write(str);
//                resp.flushBuffer();
//                } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//                } catch (SQLException e) {
//                e.printStackTrace();
//                }