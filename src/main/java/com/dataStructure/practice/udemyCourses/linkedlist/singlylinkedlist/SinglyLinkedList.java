package com.dataStructure.practice.udemyCourses.linkedlist.singlylinkedlist;

import com.dataStructure.practice.udemyCourses.linkedlist.CustomLinkedList;

public class SinglyLinkedList implements CustomLinkedList {
    public Node head;
    public Node tail;
    public int size;


    @Override
    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    @Override
    public void insertInSinglyLinkedList(int nodeValue, int location) {

        Node node = new Node();
        node.value = nodeValue;

        if (head == null) {//if node is not created
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {//at begin
            node.next = head;
            head = node;
        } else if (location >= size) {//at last
            node.next = null;
            tail.next = node;
            tail = node;
        } else {//at given position
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    @Override
    public void traversalSinglyLinkedList() {
        if (head == null) {
            System.out.println("SLL does not exist!!");
        } else {
            Node temp = head;
            for (int i = 0; i < size; i++) {
                System.out.print(temp.value);
                if (i != size - 1) {
                    System.out.print(" --> ");
                }
                temp = temp.next;
            }
        }
        System.out.println("\n");
    }

    @Override
    public boolean searchNodeInSinglyList(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Node found at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found !!!");
        return false;
    }

    @Override
    public void deleteFromSinglyList(int location) {
        if (head == null) {
            System.out.println("The SLL does not exist!!");
            return;
        } else if (location == 0) {//from first
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= 0) {//from last
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }
        else {//from in between
            Node tempNode=head;
            for (int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            tempNode.next=tempNode.next.next;
            size--;
        }
    }
}
