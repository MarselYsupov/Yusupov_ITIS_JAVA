package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
            System.out.println(Fact(n));

    }
    static int Fact(int x) {
        int fac = 1;
        for(int i=1;i<=x;i++) {
            fac=fac*i;
        }
            return fac;
    }

}
