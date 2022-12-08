package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Node head;
    Node tail;

    public SinglyLinkedList(int value) {
        head = new Node(value);
    }

    //  - add -- add an element to the list
    public void add(int value) {
        Node node = new Node(value);

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
    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) return true;
            current = current.next;
        }
        return false;
    }

    //	- find -- returns the element's index if it is in the list, -1 otherwise
    public int find(int value) {
        int count = 0;
        Node current = head;
        while (current != null) {
            if (current.value == value) return count;
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

        SinglyLinkedList copy = new SinglyLinkedList(list.head.value);

        Node current = list.head;
        Node tail = list.head;
        while (tail != null) {
            current = current.next;
            tail = current.next;
            copy.add(current.value);
        }
        return copy;
    }

    //	- sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)
    public SinglyLinkedList sort(SinglyLinkedList list) {

        boolean sorted = false;
        while (!sorted) {
            Node current;
            Node temp;
            sorted = true;

            for (int i = 0; i < list.size() - 1; i++){
                if (list.get(i).value > list.get(i+1).value) {
                    temp = list.get(i);
                    current = list.get(i);
                    current = list.get(i+1);
                    list.get(i+1).setNext(temp);
                    sorted = false;
                }
            }
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
