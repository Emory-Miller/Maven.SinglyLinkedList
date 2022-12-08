package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void addTest() {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.add(2);

        int expected = 2;
        int actual = sll.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.add(2);
        sll.add(3);
        sll.remove(2);

        int expected = 2;
        int actual = sll.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest() {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.add(2);

        boolean expected = true;
        boolean actual = sll.contains(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findTest() {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);

        int expected = 2;
        int actual = sll.find(3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest() {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);

        int expected = 5;
        int actual = sll.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest() {
        SinglyLinkedList sll = new SinglyLinkedList(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);

        Node expected = sll.;
        Node actual = sll.get(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void copyTest() {
    }

    @Test
    public void sortTest() {
    }

    @Test
    public void testToStringTest() {
    }
}
