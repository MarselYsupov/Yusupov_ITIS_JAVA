package com.company;



public class Main {

    public static void main(String[] args) {


        int[] arr = {1 ,2 ,3, 0 ,-1, 0, 2};
        int n = arr.length;
        sort1(arr);
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    static void sort1(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                array[i] = array[i-1] * (-1);

            }

        }

    }
}

////tatic void sort(int[] array){
//        int n = array.length;
//        int index=0;
//        for(int i=1;i<=n;i++) {
//        if(array[i]==0) {
//        array[i]=array[index]*(-1);
//        index=index+2;
//        }
//
//        }
//        }