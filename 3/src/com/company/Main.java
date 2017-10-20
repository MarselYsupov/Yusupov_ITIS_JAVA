package com.company;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max1, max2;
        int l1;
        int l2 = 0;
        int n = sc.nextInt();
        String[] str = new String[n];
        String[] str2 = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();

        }
        max1 = str[0].length();
        l1 = 0;
        for (int i = 1; i < n; i++) {
            if (max1 < str[i].length()) {
                max1 = str[i].length();
                l1 = i;
            }
        }
        for (int i = 1; i < n; i++) {
            if (max1 <= str[i].length()) {
                max1 = str[i].length();
                l1 = i;
            } else {
                str2[l2] = str[i];
                l2++;
            }
        }
        max2 = str2[0].length();
        int l3 = 0;
        for (int i = 1; i < l2; i++) {
            if (max2 < str2[i].length()) {
                l3 = i;
                max2 = str2[i].length();

            }
        }
        System.out.println(str[l1]);
        System.out.println(str2[l3]);

    }
}