package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ProductNotFoundException {
        ProductsDao dao = new ProductsDaoCsvImplementation();
       dao.checkDate("молоко","10,11,17");


    }
}