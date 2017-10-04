package com.company.LinkedList;

import java.util.ArrayList;

/**
 * Created by Ashutosh.Purohit on 8/9/17.
 */
public class GetNodeInLinkedListCountingBackwards {

    int GetNode(Node head, int n) {
        // This is a "method-only" submission.
        // You only need to complete this method.

        ArrayList<Integer> linkedListValues = new ArrayList<>();



        while(head != null){
            linkedListValues.add(head.data);
            head = head.next;



        }

        return linkedListValues.get(linkedListValues.size()-1-n);




    }
}
