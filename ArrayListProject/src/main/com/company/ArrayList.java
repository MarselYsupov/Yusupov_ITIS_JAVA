package com.company;

public class ArrayList {
    Object[] elements;
    int count;
    int max;

    public ArrayList(int capacity) {
        elements = new Object[capacity];
        count = 0;
        max = capacity;
    }

    Object get(int i){
        return elements[i];
    }

    /*если в массиве elements нет свободного места, следует создать
    * новый массив большей длины (например, больший в 2 раза),
    * поместить в него эл-ты из старого массива, и заменить старый на новый
    * */
    void add(Object o) {

        if(count>=max) {
            max=max*2;
            Object[] elem = (Object[]) set(count,elements);
            elements = new Object[max];
           elements = elem;
            elements[count] = o;
            count++;
        }
        else {

            elements[count] = o;
            count++;
         }
    }

    void remove(int i){
        if (i < 0 || i >= count) {
            throw new IndexOutOfBoundsException("Incorrect index: " + i);
        }
        else {
            int o = 0;
            Object [] elementsNew = new Object[count];
            for (int j=0;j<count;j++) {
                if (j!=i) {
                    elementsNew[o] = elements[j];
                    o++;
                }

            }
            count--;
            max = count;
           elements = new Object[max];
            for (int j=0;j<count;j++) {
                    elements[j] = elementsNew[j] ;



            }


        }
    }

    @Override
    public String toString() {
        String s = "ArrayList[";
        if ( String.valueOf( elements[0]) != null) {
            s += String.valueOf( elements[0]);
        } else {
            s += "null";
        }
        for ( int i =1;i<count;i++ ) {
            s += ", ";
                if ( String.valueOf( elements[i]) != null) {
                    s += String.valueOf( elements[i]);
                } else {
                    s += "null";
                }




        }
        s += "]";
        return s;
    }

    public Object set(int index, Object elements[]) {
       Object [] elementsNew = new Object[index*2];
       for (int i=0;i<index;i++) {
           elementsNew[i] = elements[i];
       }
        return elementsNew;
    }


}