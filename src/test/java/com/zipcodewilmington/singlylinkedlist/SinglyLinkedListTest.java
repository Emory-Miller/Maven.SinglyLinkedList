package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void addTest() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList(1);
        sll.add(2);

        int expected = 2;
        int actual = sll.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList(1);
        sll.add(2);
        sll.add(3);
        sll.remove(2);

        int expected = 2;
        int actual = sll.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList(1);
        sll.add(2);

        boolean expected = true;
        boolean actual = sll.contains(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findTest() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList(1);
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
        SinglyLinkedList<Integer> sll = new SinglyLinkedList(1);
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
        SinglyLinkedList<Integer> sll = new SinglyLinkedList(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);

        String expected = "Node{data=2} ";
        String actual = sll.get(1).toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void copyTest() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);

        SinglyLinkedList<Integer> copy = sll.copy(sll);

        Integer expected = (Integer) sll.get(1).data;
        Integer actual = (Integer) copy.get(1).data;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortASCTest() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList(1);
        sll.add(5);
        sll.add(2);
        sll.add(10);
        sll.add(6);

        String expected = "Nodes in List: Node{data=1} Node{data=2} Node{data=5} Node{data=6} Node{data=10} ";
        String actual = sll.sortASC(sll).toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortDESCTest() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList(1);
        sll.add(5);
        sll.add(2);
        sll.add(10);
        sll.add(6);

        String expected = "Nodes in List: Node{data=10} Node{data=6} Node{data=5} Node{data=2} Node{data=1} ";
        String actual = sll.sortDESC(sll).toString();

        Assert.assertEquals(expected, actual);
    }

}
