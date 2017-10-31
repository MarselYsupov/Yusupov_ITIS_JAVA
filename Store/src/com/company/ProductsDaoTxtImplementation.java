package com.company;

import java.io.*;

public class ProductsDaoTxtImplementation implements ProductsDao {


    @Override
    public boolean exists(String product) throws IOException {
        boolean exists = false;
        File file = new File("products.txt");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String str = br.readLine();
        while (str != null){
            if (str.equals(product)){
                exists = true;
            }
            str = br.readLine();
        }
        return exists;
    }

    @Override
    public void add(String product) throws IOException {
        File file = new File("products.txt");
        Writer writer = new FileWriter(file, true);
        BufferedWriter wr = new BufferedWriter(writer);
        wr.write(product);
        wr.flush();
        wr.write("\n");
        wr.flush();
    }

    @Override
    public void remove(String product) throws IOException {
        int size = size();
        File file = new File("products.txt");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String [] str = new String [size] ;
        for (int i = 0;i<size;i++ ) {
            str[i] = br.readLine();
            if  (str[i].equals(product)) {
                str[i] = "";

            }
        }

        Writer writer = new FileWriter(file,false);
        BufferedWriter wr = new BufferedWriter(writer);
        for (int i = 0;i<size;i++ ) {
            if (str[i].equals("")){}
                else {
                wr.write(str[i]);
                wr.flush();
                wr.write("\n");
                wr.flush();
            }

        }

    }

    @Override
    public void replace(String product1, String product2) throws IOException {
        int size = size();
        File file = new File("products.txt");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String [] str = new String [size] ;
        for (int i = 0;i<size;i++ ) {
            str[i] = br.readLine();
            if  (str[i].equals(product1)) {
                str[i] = product2;

            }
        }

        Writer writer = new FileWriter(file,false);
        BufferedWriter wr = new BufferedWriter(writer);
        for (int i = 0;i<size;i++ ) {
                wr.write(str[i]);
                wr.flush();
                wr.write("\n");
                wr.flush();


        }

    }


    int size() throws IOException {
        File file = new File("products.txt");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String str = br.readLine();
        int count = 0;
        while (str != null){
            count++;
            str = br.readLine();
       }
        return count;
  }
}