package com.company;

import java.io.*;

public class ProductsDaoTxtImplementation implements ProductsDao  {
    @Override
    public boolean exists(Product product) throws IOException {
        boolean exists = false;
        File file = new File("products.txt");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String str = br.readLine();
        while (str != null){
            if (str.equals(product.name)){
                exists = true;
            }
            str = br.readLine();
        }

        return exists;
    }

    @Override
    public void add(Product product) throws IOException {
        File file = new File("products.txt");
        Writer writer = new FileWriter(file, true);
        BufferedWriter wr = new BufferedWriter(writer);
        wr.write(product.name);
        wr.flush();
        wr.write("\n");
        wr.flush();
    }

    @Override
    public void remove(String product) throws IOException {
        File file = new File("products.txt");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String[] products = new String[size()];
        String str;
        int i = 0;
        while ((str  = br.readLine()) != null){
            if (!str.equals(product)) {
                products[i] = str;
                i++;
            }
        }
        int elementsCount = i;
        Writer writer = new FileWriter(file, false);
        BufferedWriter wr = new BufferedWriter(writer);
        for (int j = 0; j < i; j++) {
            wr.write(products[j]);
            wr.newLine();
        }
        wr.flush();

    }

    @Override
    public void replace(String product1, String product2) throws IOException {

    }

    @Override
    public int getPrice(String productName) throws IOException {
        return 0;
    }

    @Override
    public void checkDate(String productName, String date) throws IOException {

    }



    /**
     * Считает количество продуктов в файле
     * @return число продуктов
     */
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