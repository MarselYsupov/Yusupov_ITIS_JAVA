package com.company;

public class Main {

    public static void main(String[] args) {

        boolean eq=false;
        int[] arr = {2, 1, 7, 1, 4, 6, 5, 0, 8, 3};
        int n = arr.length;
        sort(arr,eq);

    }

    static void sort(int[] array,boolean e){
        int n = array.length;
        for (int j = 0; j < n; j++) {
            int index = j;
            for (int i = j; i < n; i++) {
                if (array[index] == array[i]) {
                    e=true;
                }
            }

        }
        System.out.println(e);
    }
}
