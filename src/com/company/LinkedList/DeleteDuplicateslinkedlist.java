package com.company.LinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ashutosh.Purohit on 6/23/17.
 */


 //Definition for singly-linked list.

 //public class ListNode {
  //    int val;
  //    ListNode next;
   //   ListNode(int x) { val = x; }


/*public class DeleteDuplicateslinkedlist {

    public ListNode deleteDuplicates(ListNode head) {

        List<Integer> visited = new ArrayList<>();
        ListNode startnode = head;
        ListNode previousnode = head;
        ListNode currentnode = head;

        while(currentnode != null){
            if (visited.contains(currentnode.val)){
                previousnode.next = currentnode.next;
                currentnode = currentnode.next;

            }
            else{
                visited.add(currentnode.val);
                previousnode = currentnode;
                currentnode = currentnode.next;
            }
        }

        return startnode;

    }


}*/
