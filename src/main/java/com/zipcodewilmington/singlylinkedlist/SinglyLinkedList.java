package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T extends Comparable>{
    Node head;
    Node tail;

    public SinglyLinkedList(T data) {
        head = new Node(data);
    }

    //  - add -- add an element to the list
    public void add(T data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
        }

        Node current = head;
        Node tail = current.next;
        while (tail != null) {
            current = current.next;
            tail = current.next;
        }
        current.setNext(node);
    }

    //	- remove -- remove an element (specified by numeric index) from the list
    public void remove(int index) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
            if ((count + 1) == index) {
                Node remove = current.next;
                current.setNext(remove.next);
                break;
            }
        }
    }

    //	- contains -- returns true if the element is in the list, false otherwise
    public boolean contains(T data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) return true;
            current = current.next;
        }
        return false;
    }

    //	- find -- returns the element's index if it is in the list, -1 otherwise
    public int find(T data) {
        int count = 0;
        Node current = head;
        while (current != null) {
            if (current.data == data) return count;
            current = current.next;
            count++;
        }
        return -1;
    }

    //  - size -- returns the current size of the list
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    //	- get -- returns the element at the specified index
    public Node get(int index) {
        int count = 0;
        Node current = head;
        while (current != null) {
            if (count == index) return current;
            current = current.next;
            count++;
        }
        return null;
    }

    //	- copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
    public SinglyLinkedList copy(SinglyLinkedList list) {
        if (head == null) return null;

        SinglyLinkedList copy = new SinglyLinkedList(list.head.data);

        Node current = list.head;
        Node tail = list.head;
        while (tail != null) {
            current = current.next;
            tail = current.next;
            copy.add(current.data);
        }
        return copy;
    }

    //	- sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)
    public SinglyLinkedList sort(SinglyLinkedList list) {
        Node prevNode = list.head;
        Node current = prevNode.next;
        Node temp = new Node(head.data);
        for (int i = 0; i < list.size() ; i++){
            while (current != null){
                if(prevNode.data.compareTo(current.data) >0){
                    temp.data = prevNode.data;
                    prevNode.data = current.data;
                    current.data = temp.data;
                }
                prevNode = current;
                current = current.next;
            }
           prevNode = list.head;
           current = prevNode;
        }

        return list;
    }

    @Override
    public String toString() {
        Node current = head;
        StringBuilder nodes = new StringBuilder();
        nodes.append("Nodes in List: ");
        while (current != null) {
            nodes.append(current.toString());
            current = current.next;
        }
        return nodes.toString();
    }

}
