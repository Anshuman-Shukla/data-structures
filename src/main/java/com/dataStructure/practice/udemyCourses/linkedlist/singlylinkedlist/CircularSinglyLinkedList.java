package com.dataStructure.practice.udemyCourses.linkedlist.singlylinkedlist;

import com.dataStructure.practice.udemyCourses.linkedlist.CustomLinkedList;

public class CircularSinglyLinkedList implements CustomLinkedList {
    public Node head;
    public Node tail;
    public int size;

    @Override
    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    @Override
    public void insertInSinglyLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    @Override
    public void traversalSinglyLinkedList() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++)
            {
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.println("  -->  ");
                }
                tempNode=tempNode.next;
        }}
        else {
            System.out.println(" Circular Single Linked list Does not exist!!");
        }
    }

    @Override
    public boolean searchNodeInSinglyList(int nodeValue) {
        if(head!=null){
            Node tempNode=head;
            for(int i=0;i<size;i++){
                if(tempNode.value==nodeValue){
                    System.out.println("Found node at location: "+i);
                    return true;
                }
                tempNode=tempNode.next;
            }
        }
        System.out.println("Node not found!!!");
        return false;
    }

    @Override
    public void deleteFromSinglyList(int location) {

    }
}
