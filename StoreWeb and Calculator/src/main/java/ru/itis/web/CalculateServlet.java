package ru.itis.web;

import ru.itis.Calculate.Calculator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CalculateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Calculator calculator = new Calculator();
        String firN  =  req.getParameter("a");
        String operator = req.getParameter("operator");
        String secNum = req.getParameter("b");
        double res ;
        String str;
        double firstNum = Double.parseDouble(firN);
        double secondNum = Double.parseDouble(secNum);
        if (operator.equals("*")) {
            res = calculator.multiply(firstNum,secondNum);
            str = "Answer=" + res;
        }
        else if (operator.equals("/")){
            res = calculator.divide(firstNum,secondNum);
            str = "Answer=" + res;
        }
        else if (operator.equals("-")) {
            res = calculator.substract(firstNum,secondNum);
            str = "Answer=" + res;
        }
        else if (operator.equals("+")) {
            res = calculator.add(firstNum,secondNum);
            str = "Answer=" + res;
        }
        else {
            str = "Error Operator 404: " + operator;

        }
        resp.getWriter().write(str);





    }
}
