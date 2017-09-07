package com.company;

/**
 * Created by Ashutosh.Purohit on 8/8/17.
 */
public class DeleteNodeFromPositioninLinkedList {

    Node Delete(Node head, int position) {
        // Complete this method

        int currentposition = 0;
        Node currentnode = head;
        Node previousnode = head;


        if(position == 0){

            return head.next;
        }

        while(currentposition != position){
            currentposition += 1;
            previousnode = currentnode;
            currentnode = currentnode.next;

        }

        previousnode.next = currentnode.next;
        return head;



    }
}
