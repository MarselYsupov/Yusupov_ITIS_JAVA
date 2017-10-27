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
        String elemToReturn = new String();
        if (count>0) {
             elemToReturn = elements[count - 1];
            count--;
        } else {
             elemToReturn ="";
        }
        return elemToReturn;
    }

    int size(){

        return count;

    }
}