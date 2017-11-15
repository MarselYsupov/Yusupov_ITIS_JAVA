package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {
    @Test
    public void addElemFromArrayListShouldShowElem() {
        System.out.println(" addElemFromArrayListShouldShowElem");
        ArrayList  list = new ArrayList(2);
        list.add("42");
        list.add(null);
        assertEquals("42", list.elements[0]);
        assertEquals(null, list.elements[1]);
    }
    @Test
    public void addElemFromEmptyArrayListShouldShowNull() {
        System.out.println(" addElemFromEmptyArrayListShouldShowNull");
        ArrayList  list = new ArrayList(1);
        assertEquals(null, list.elements[0]);
    }
    @Test
    public void getElemIndexFromArrayListShouldShowElem() {
        System.out.println(" getElemIndexFromArrayListShouldShowElem");
        ArrayList  list = new ArrayList(1);
        list.add("53");
        list.add("12");
        list.add("53");
        list.add(null);
        list.add(null);
        list.add("4");
        assertEquals("53", list.get(2));
        assertEquals(null, list.get(3));
    }
    @Test
    public void getElemIndexFromArrayListShouldShowNull() {
        System.out.println(" getElemIndexFromArrayListShouldShowElem");
        ArrayList  list = new ArrayList(1);
        list.add("53");
        list.add("12");
        list.add("53");
        list.add(null);
        list.add(null);
        list.add("4");
        assertEquals(null, list.get(3));
    }
    @Test
    public void OutIndexFromArrayListShouldShow2Capacity() {
        System.out.println(" getElemIndexFromArrayListShouldShowElem");
        ArrayList  list = new ArrayList(3);
        list.add("53");
        list.add("12");
        list.add("53");
        list.add(null);
        list.add(null);
        list.add("4");
        assertEquals(6, list.max);
    }
}
