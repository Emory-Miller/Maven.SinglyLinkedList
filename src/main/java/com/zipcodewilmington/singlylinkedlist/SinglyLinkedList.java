package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T extends Comparable<T>>{
    Node<T> head;

//    public SinglyLinkedList(T data) {
//        head = new Node<T>(data);
//    }

    //  - add -- add an element to the list
    public void add(T data) {
        Node<T> node = new Node<T>(data);

        if (this.head == null) {
            this.head = node;
        }

        else {
            Node<T> current = this.head;
            Node<T> tail = current.next;
            while (tail != null) {
                current = current.next;
                tail = current.next;
            }
            current.setNext(node);
        }
    }

    //	- remove -- remove an element (specified by numeric index) from the list
    public void remove(int index) {
        int count = 0;
        Node<T> current = this.head;

        if (index == 0 && current.hasNext()) this.head = head.next;

        else if (index == 0 && !current.hasNext()) {
            this.head = null;
        }

        else if (index == size()-1) {
            current = get(index-1);
            current.setNext(null);
        }

        else {
            while (current.hasNext()) {
                if (count == index) {
                    Node<T> remove = current.next;
                    current.setNext(remove.next);
                    break;
                }
                current = current.next;
                count++;
            }
        }
    }

    //	- contains -- returns true if the element is in the list, false otherwise
    public boolean contains(T data) {
        return find(data) != -1;
//        Node<T> current = head;
//        while (current != null) {
//            if (current.data == data) return true;
//            current = current.next;
//        }
//        return false;
    }

    //	- find -- returns the element's index if it is in the list, -1 otherwise
    public int find(T data) {
        int count = 0;
        Node<T> current = head;
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
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    //	- get -- returns the element at the specified index
    public Node<T> get(int index) {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            if (count == index) return current;
            current = current.next;
            count++;
        }
        return null;
    }

    //	- copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
    public SinglyLinkedList<T> copy() {
        if (head == null) return null;

        SinglyLinkedList<T> copy = new SinglyLinkedList<T>();

        Node<T> current = this.head;
        while (current.hasNext()) {
            copy.add(current.data);
            current = current.next;
        }
        return copy;
    }

    //	- sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)
    public SinglyLinkedList<T> sortASC(SinglyLinkedList<T> list) {
        Node<T> prevNode = list.head;
        Node<T> current = prevNode.next;
        Node<T> temp = new Node<T>(head.data);
        for (int i = 0; i < list.size() ; i++){
            while (current != null){
                if(prevNode.data.compareTo(current.data) > 0){
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

    public SinglyLinkedList<T> sortDESC(SinglyLinkedList<T> list) {
        Node<T> prevNode = list.head;
        Node<T> current = prevNode.next;
        Node<T> temp = new Node<T>(head.data);
        for (int i = 0; i < list.size() ; i++){
            while (current != null){
                if(prevNode.data.compareTo(current.data) < 0){
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
        Node<T> current = head;
        StringBuilder nodes = new StringBuilder();
        nodes.append("Nodes in List: ");
        while (current != null) {
            nodes.append(current.toString());
            current = current.next;
        }
        return nodes.toString();
    }

}
