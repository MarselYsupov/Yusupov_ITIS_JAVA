package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int [] mas  =  new int [n];
        for(int i=0;i<n;i++) {
            mas[i]=sc.nextInt();
        }
        for(int i=1;i<n;i=i + 2) {
           sum=sum+mas[i];
        }
            System.out.println(sum);
    }
}
