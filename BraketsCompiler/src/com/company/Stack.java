package com.company;

public class Stack {
    private String [] elements;
    private int count;
    int closebr1;
    int closebr2;
    int closebr3;
    public Stack(int cap) {
        elements = new String[cap];
        count = 0;
        closebr1=0;
        closebr2=0;
        closebr3=0;
    }

    void push (String elem) {
        elements [count] = elem;
        count++;
    }

    String pop () {
        String StrBraketTOReturn =  new String();
        if(count>0) {
            StrBraketTOReturn = elements [count-1];
            count--;
        }
        else {
            StrBraketTOReturn = "";
        }
        return StrBraketTOReturn;
    }

    int size() {
        return count;
    }
    void SortBracket (String braket) {

        if(braket.equals(")")) closebr1++;
            else if(braket.equals("]")) closebr2++;
                else if(braket.equals("}")) closebr3++;
    }
    int return1 (){
        return closebr1;
    }
    int return2(){
        return closebr2;
    }
    int return3(){
        return closebr3;
    }

}
