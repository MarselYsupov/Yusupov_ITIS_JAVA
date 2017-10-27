package com.company;

public class Stack {
    private String[] elements;
    private int count;

    public Stack(int capacity) {
        elements = new String[capacity];
        count = 0;
    }

    void push(String elem) {
        elements[count] = elem;
        count++;
    }


    String pop() {
        String elemsToReturn = new String();//ошибку исправил
        if (count>0) {
             elemsToReturn = elements[count - 1];
            count--;
        } else {
             elemsToReturn ="";
        }
        return elemsToReturn;
    }

    int size(){

        return count;//возращение счетчика добавил

    }
}