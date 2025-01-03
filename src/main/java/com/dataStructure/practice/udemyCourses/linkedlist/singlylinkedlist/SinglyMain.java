package com.dataStructure.practice.udemyCourses.linkedlist.singlylinkedlist;

import com.dataStructure.practice.udemyCourses.linkedlist.CustomLinkedList;

public class SinglyMain {
    public static void main(String[] args) {
        CustomLinkedList singlylist= new SinglyLinkedList();
        singlylist.createSinglyLinkedList(1);
        singlylist.traversalSinglyLinkedList();
        singlylist.insertInSinglyLinkedList(2,2);
        singlylist.insertInSinglyLinkedList(3,3);
        singlylist.traversalSinglyLinkedList();
        singlylist.searchNodeInSinglyList(3);
        singlylist.deleteFromSinglyList(2);
        singlylist.traversalSinglyLinkedList();

    }
}
