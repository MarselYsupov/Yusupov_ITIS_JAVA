package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] let= {"a","b","v","r"};
        String word = sc.next();
        System.out.println( exists(let, word));
    }

    static boolean exists(String[] arr, String str) {
        int n = arr.length;
        boolean bul=false;

        for(int i = 0 ; i<n; i++) {
            if(arr[i].equals(str)) {
                bul=true;
            }
        }
        return bul;
    }
}
