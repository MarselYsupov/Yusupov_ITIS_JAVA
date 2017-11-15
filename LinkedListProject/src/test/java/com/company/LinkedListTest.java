package com.company;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    LinkedList<String> linkedList;

    @BeforeClass
    public static void before() throws Exception {
        System.out.println("I am BeforeClass");
    }

    @Before
    public void setUp() {
        System.out.println("SetUp method is starting");
        linkedList = new LinkedList<>();
        linkedList.add("abc");
        linkedList.add("sdfc");
        linkedList.add("asdfyj");
        linkedList.add("abc");
        linkedList.add("ajukbc");
    }

    @Test
    public void removeFromEmptyListShouldChangeNothing() {
        System.out.println("removeFromEmptyListShouldChangeNothing");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.remove(0);
        assertEquals(0, linkedList.size());
    }

    @Test
    public void removeFromListWithOneElementShouldMakeItEmpty() {
        System.out.println("removeFromListWithOneElementShouldMakeItEmpty");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("abc");
        linkedList.remove(0);
        assertEquals(0, linkedList.size());
    }

    @Test
    public void removeLastElementShouldDecrementSize() {
        System.out.println("removeLastElementShouldDecrementSize");
    }

    @Test
    public void removeFirstElementShouldDecrementSize() {
        System.out.println("removeFirstElementShouldDecrementSize");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
    }
}