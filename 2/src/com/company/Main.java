package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] mas  =  new int [n+1];
        for(int i=0;i<n;i++) {
            mas[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--) {
            System.out.println(mas[i]);
        }

    }
}
