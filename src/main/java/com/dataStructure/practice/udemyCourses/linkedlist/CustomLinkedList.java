package com.dataStructure.practice.udemyCourses.linkedlist;

import com.dataStructure.practice.udemyCourses.linkedlist.singlylinkedlist.Node;

public interface CustomLinkedList {
    //Create
    public Node createSinglyLinkedList(int nodeValue);

    //Insert
    public void insertInSinglyLinkedList(int nodeValue, int location);

    //Traversal
    public void traversalSinglyLinkedList();

    //Searching
    public boolean searchNodeInSinglyList(int nodeValue);

    //Delete
    public void deleteFromSinglyList(int location);
}
