package com.company.LinkedList;

import com.company.LinkedList.ListNode;

import java.util.ArrayList;

/**
 * Created by Ashutosh.Purohit on 7/4/17.
 */


public class RotateRight {

    public class Solution {
        public ListNode rotateRight(ListNode head, int k) {

            if(head == null || head.next == null){
                return head;
            }
            ListNode node = head;
            ArrayList<ListNode> queue = new ArrayList<ListNode>();
            ListNode temp;

            while (node != null){
                queue.add(node);
                node = node.next;
            }
            k = k%queue.size();
            if (k==0){
                k = queue.size();
            }

            while(k>0){
                temp = queue.remove(queue.size()-1);
                temp.next = queue.get(0);
                queue.get(queue.size()-1).next=null;
                queue.add(0,temp);
                k--;
            }

            return queue.get(0);

        }
    }
}
