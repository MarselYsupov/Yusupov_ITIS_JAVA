package ru.itis.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CalculatorServlet  extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str = "<html>\n" +
                "    <head>\n" +
                "        <meta charset=\"utf-8\">\n" +
                "        <title>Example</title>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "\n" +
                "        <form action =\"/storeweb-1.0-SNAPSHOT/calculate\">\n" +
                "\n" +
                "          \n" +
                "          <br> a: <input type=\"number\"  name=\"a\" value=\"\"  step=\"any\"> </br>\n" +
                "            <br> operator: <input type=\"text\" name=\"operator\" value=\"\"> </br>\n" +
                "            <br> b: <input type=\"number\" name=\"b\" value=\"\" step=\"any\"> </br>\n" +
                "\n" +
                "           \n" +
                "           <br>  <br>  <input type=\"submit\" value=\"Calculate\"> </br> </br>\n" +
                "        </form>\n" +
                "    </body>\n" +
                "</html>\n" +
                "\n" +
                "\n";

        resp.getWriter().write(str);
    }
}
