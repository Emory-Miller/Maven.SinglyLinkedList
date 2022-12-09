package com.zipcodewilmington.singlylinkedlist;

public class Node<T extends Comparable<T>>{

    T data;
    Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public Node (T data){
        this.data = data;
        this.next = null;
    }

    public Node<T> getNext() {
        return next;
    }

    public boolean hasNext(){
        return getNext() != null;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                "} ";
    }
}
