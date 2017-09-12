package com.company;

/**
 * Created by Ashutosh.Purohit on 8/8/17.
 */
public class InsertNthLinkedList {

    public Node InsertNth(Node head, int data, int position) {
        // This is a "method-only" submission.
        // You only need to complete this method.

        int currentposition = 0;
        Node currentnode = head;
        Node previousnode = head;
        Node insertnode = new Node();
        insertnode.data = data;

        if(position == 0){
            insertnode.next = head;
            return insertnode;
        }

        while(currentposition != position){
            currentposition += 1;
            previousnode = currentnode;
            currentnode = currentnode.next;

        }

        previousnode.next = insertnode;
        insertnode.next = currentnode;
        return head;

    }
}
