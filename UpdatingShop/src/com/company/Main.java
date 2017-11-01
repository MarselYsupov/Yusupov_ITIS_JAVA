package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    ProductsDao dao = new ProductsDaoTxtImplementation();
       dao.subtractnumproducts("молоко",4);
    }


}
