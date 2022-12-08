package com.zipcodewilmington.singlylinkedlist;

public class Node<T extends Comparable> {

    T data;
    Node next;

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node (T data){
        this.data = data;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                "} ";
    }
}
