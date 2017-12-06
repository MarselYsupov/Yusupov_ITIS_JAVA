package ru.itis.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String str = "<html>\n" +
              "    <head>\n" +
              "        <meta charset=\"utf-8\">\n" +
              "        <title>Example</title>\n" +
              "    </head>\n" +
              "    <body>\n" +
              "\n" +
              "        <form action =\"/storeweb-1.0-SNAPSHOT/saveProduct\">\n" +
              "\n" +
              "          \n" +
              "          <br> name: <input type=\"text\"  name=\"name\" value=\"\"> </br>\n" +
              "            <br> factory: <input type=\"text\" name=\"factory\" value=\"\"> </br>\n" +
              "            <br> price: <input type=\"number\" name=\"price\" value=\"\"> </br>\n" +
              "\t\t\t <br> count: <input type=\"neumber\"  name=\"count\" value=\"\"> </br>\n" +
              "           \n" +
              "           <br>  <br>  <input type=\"submit\" value=\"AddProduct\"> </br> </br>\n" +
              "        </form>\n" +
              "    </body>\n" +
              "</html>\n";
      resp.getWriter().write(str);
    }
}
