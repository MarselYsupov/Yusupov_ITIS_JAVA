package com.company;

import java.io.*;

public class ProductsDaoTxtImplementation implements ProductsDao {
    @Override
    public boolean exists(String product) throws IOException {
        boolean exists = false;
        File file = new File("products.txt");
        Reader reader = new FileReader(file);
        BufferedReader br = new  BufferedReader(reader);
       String str = br.readLine();
        while(str != null) {
            if (word(str,product).equals(product)) {
                exists = true;
            }
            str = br.readLine();
        }


        return exists;
    }

    @Override
    public void add(String product,int number) throws IOException  {
        File file = new File("products.txt");
        Writer writer = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write(product + " " + number);
        bw.flush();
        bw.write("\n");
        bw.flush();


    }

    @Override
    public void remove(String product) throws IOException  {
        File file = new File("products.txt");
        Reader reader = new FileReader(file);
        BufferedReader br = new  BufferedReader (reader);
        int size = size();
        String [] str = new String[size];
        for (int i=0;i<size;i++) {
           str[i] = br.readLine();
            if (word(str[i],product).equals(product)) {
                str [i] = " ";
            }
        }
        Writer writer = new FileWriter(file,false);
        BufferedWriter wr = new BufferedWriter (writer);
        for (int i=0;i<size;i++) {
            if (str[i].equals(" ")) {}
            else {
                wr.write(str[i]);
                wr.flush();
                wr.write("\n");
                wr.flush();


            }

        }

    }

    @Override
    public void replace(String product1, String product2,int num) throws  IOException {
        File file = new File("products.txt");
        Reader reader = new FileReader(file);
        BufferedReader br = new  BufferedReader (reader);
        int size = size();
        String [] str = new String[size];

        for (int i=0;i<size;i++) {
            str[i] = br.readLine();
            if (word(str[i],product1).equals(product1)) {
                str [i] =  product2 + " " + String.valueOf(num)  ;
            }
        }
        Writer writer = new FileWriter(file,false);
        BufferedWriter wr = new BufferedWriter (writer);
        for (int i=0;i<size;i++) {
                wr.write(str[i]);
                wr.flush();
                wr.write("\n");
                wr.flush();


            }

        }

    @Override
    public int numberproduct(String product) throws IOException {
        int num=0;
        File file = new File("products.txt");
        Reader reader = new FileReader(file);
        BufferedReader br = new  BufferedReader (reader);
        int size = size();
        String [] str = new String[size];
        for (int i=0;i<size;i++) {
            str[i] = br.readLine();
            if(product.equals((word(str[i],product)))) {
                num=numberprod(str[i]);
            }

        }
        return num;

    }

    @Override
    public void addnumproducts(String product, int number) throws IOException {
        int num = 0;
       File file =  new File("products.txt");
       Reader reader = new FileReader(file);
       BufferedReader br = new BufferedReader(reader);
       int size = size();
       String [] str = new String[size];
       for (int i=0;i<size;i++) {
           str[i] = br.readLine();
           if(product.equals((word(str[i],product)))) {
               num=numberprod(str[i]);
               num=num+number;
               str[i] = product + " " + String.valueOf(num);
           }

       }
        Writer writer = new FileWriter(file,false);
       BufferedWriter bw = new BufferedWriter(writer);
        for (int i=0;i<size;i++) {
            bw.write(str[i]);
            bw.flush();
            bw.write("\n");
            bw.flush();
        }

    }

    @Override
    public void subtractnumproducts(String product, int number) throws IOException {
        int num = 0;
        File file =  new File("products.txt");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        int size = size();
        String [] str = new String[size];
        for (int i=0;i<size;i++) {
            str[i] = br.readLine();
            if(product.equals((word(str[i],product)))) {
                num=numberprod(str[i]);
                num=num-number;
                str[i] = product + " " + String.valueOf(num);
            }

        }
        Writer writer = new FileWriter(file,false);
        BufferedWriter bw = new BufferedWriter(writer);
        for (int i=0;i<size;i++) {
            bw.write(str[i]);
            bw.flush();
            bw.write("\n");
            bw.flush();
        }

    }


    int size () throws IOException {
        File file = new File("products.txt");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String str = br.readLine();
        int cout = 0;
        while (str != null) {
            cout++;
            str = br.readLine();
        }
        return cout;
    }

    int numberprod(String s) throws IOException {
        String str ="";
        char [] symbol = new char[s.length()];
        for (int i = 0 ; i<s.length();i++) {
            symbol[i] = s.charAt(i);
            if ((symbol[i] == '0') || (symbol[i] == '1') || (symbol[i] == '2')
                    || (symbol[i] == '3') || (symbol[i] == '4') || (symbol[i] == '5')
                    || (symbol[i] == '6') || (symbol[i] == '7') || (symbol[i] == '8')
                    ||(symbol[i] == '9')){
                str = str + symbol[i];

            }
        }
        int product = Integer.valueOf(str);
        return product;
    }
    String word(String s1, String s2) throws IOException {
        String str ="";
        char [] symbol = new char[s2.length()];
        String str1 = String.valueOf( numberprod(s1));
        if(s2.length() == (s1.length()-str1.length()-1) ) {
            for (int i = 0; i < s2.length(); i++) {
                symbol[i] = s1.charAt(i);
                str = str + symbol[i];
            }
        }

         return  str;
    }
}
