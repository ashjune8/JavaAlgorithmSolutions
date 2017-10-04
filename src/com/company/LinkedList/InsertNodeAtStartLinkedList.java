package com.company.LinkedList;

public class InsertNodeAtStartLinkedList {

    private Node Insert(Node head,int x){

        Node tempnode = new Node();
        tempnode.data = x;
        tempnode.next = head;
        return tempnode;

    }
}
