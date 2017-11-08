package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

public class ProductsDaoCsvImplementation implements ProductsDao{


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
        File file = new File("products.csv");
        Writer writer = new FileWriter(file, true);
        BufferedWriter wr = new BufferedWriter(writer);
        wr.write(product.name + ", " + product.price +  ", " + product.supplierName);
        wr.flush();
        wr.write("\n");
        wr.flush();
    }

    @Override
    public void remove(String product) throws IOException {

    }

    @Override
    public void replace(String product1, String product2) throws IOException {

    }

    @Override
    public int getPrice(String productName) throws IOException, ProductNotFoundException {
        File file = new File("products.csv");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String str = br.readLine();
        while (str != null){
            String[] arr = str.split(", ");
            if (arr[0].equals(productName)){
                return Integer.valueOf(arr[1]);
            }
            str = br.readLine();
        }
        throw new ProductNotFoundException("Продукт " + productName + " не найден");
    }

    @Override
    public void checkDate(String productName, String date) throws IOException {
        File file = new File("products.csv");
        File fileUtiliz = new File("lateproducts.csv");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String[] products = new String[size()];
        int [] shopDate = new int[3];
        int [] dateCheck = new int[3];
        int i = 0;
        boolean noLateProduct = true;
        String str = br.readLine();
        while (str != null){
            String[] arr = str.split(", ");
            if (arr[0].equals(productName)){
                String[] dating  = date.split(",");
                String[] shopDating  = arr[2].split(",");
                for (int j=0;j<3;j++) {
                    dateCheck[j] = Integer.valueOf(dating[j]);
                    shopDate[j] = Integer.valueOf(shopDating[j]);
                }
                if(dateCheck[2]>=shopDate[2]) {
                    if(dateCheck[1]>=shopDate[1]){
                        if(dateCheck[0]>=shopDate[0]) {
                            System.out.println("Данный продукт просрочен,отправляю в склад для утилизации данного продукта");
                            noLateProduct=false;
                            Writer writer = new FileWriter(fileUtiliz,true);
                            BufferedWriter wr1 = new BufferedWriter(writer);
                            wr1.write(arr[0] + ", " + arr[1] + ", " + arr[2]);
                            wr1.write("\n");
                            wr1.flush();
                        }
                    }
                }
            }
            else {
                products[i] = str;
                i++;
            }
            str = br.readLine();
        }
        if (!noLateProduct) {
            int elementsCount = i;
            Writer writer = new FileWriter(file, false);
            BufferedWriter wr = new BufferedWriter(writer);
            for (int j = 0; j < elementsCount; j++) {
                wr.write(products[j]);
                wr.newLine();
            }
            wr.flush();

        }
        else System.out.println("Данный продукт не просрочен");
    }
    int size() throws IOException {
        File file = new File("products.csv");
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