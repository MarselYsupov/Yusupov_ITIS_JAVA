package com.company;



public class Main {

    public static void main(String[] args) {
        int n = 10;

        int[] arr = {2, 1, 7, 9, 4, 6, 5, 0, 8, 3};
            sort(arr);
        for(int j=0;j<n;j++) {
            System.out.print(arr[j]+" ");
        }
    }

    static void sort(int[] array){
        int n = array.length;
        for (int j = 0; j < n; j++) {
            int index = j;
            for (int i = j; i < n; i++) {
                if (array[index] < array[i]) {
                    index = i;
                }
            }
            int buf = array[j];
            array[j] = array[index];
            array[index] = buf;
        }
    }
}
