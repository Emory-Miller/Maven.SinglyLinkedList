package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {


    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(1);
        System.out.println(singlyLinkedList.toString());
        singlyLinkedList.add(2);
        System.out.println(singlyLinkedList.toString());
        singlyLinkedList.add(3);
        System.out.println(singlyLinkedList.toString());
        singlyLinkedList.add(4);
        System.out.println(singlyLinkedList.toString());
        System.out.println(singlyLinkedList.size());
        singlyLinkedList.remove(2);
        System.out.println(singlyLinkedList.toString());
        System.out.println(singlyLinkedList.contains(5));
        System.out.println(singlyLinkedList.find(2));
        System.out.println(singlyLinkedList.get(2));
        singlyLinkedList.add(2);
        singlyLinkedList.add(6);
        singlyLinkedList.add(3);
        System.out.println(singlyLinkedList.sort(singlyLinkedList));
    }
}
