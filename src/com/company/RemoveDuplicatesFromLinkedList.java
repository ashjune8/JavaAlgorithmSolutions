package com.company;

/**
 * Created by Ashutosh.Purohit on 8/9/17.
 */
public class RemoveDuplicatesFromLinkedList {

    Node RemoveDuplicates(Node head) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        Node start = head;

        Node current = head;
        Node next = head.next;
        while (next != null){
            if (current.data == next.data){

                current.next = next.next;
                next = next.next;

            }
            else{
                current = next;
                next = next.next;
            }
        }

        return start;

    }

}
