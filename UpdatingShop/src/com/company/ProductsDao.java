package com.company;
import java.io.IOException;
public interface  ProductsDao {
    boolean exists (String product)throws IOException;

    void add (String product,int number)throws IOException;

    void remove(String product)throws IOException;

    void replace(String product1,String product2,int num)throws IOException;

    int numberproduct (String product) throws IOException;

    void addnumproducts (String product,int number) throws IOException;

    void subtractnumproducts (String product,int number) throws IOException;

}
