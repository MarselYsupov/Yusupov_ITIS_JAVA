package com.company;



public class Main {

    public static void main(String[] args) {
        ArrayList  list = new ArrayList(2);
        list.add("53");
        list.add("12");
        list.add("53");
        list.add(null);
        list.add(null);
        list.add("4");
            list.remove(3);
        System.out.println(list.toString());

    }
}