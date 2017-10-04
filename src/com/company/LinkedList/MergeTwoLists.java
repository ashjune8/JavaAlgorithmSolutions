package com.company.LinkedList;

import com.company.LinkedList.ListNode;

/**
 * Created by Ashutosh.Purohit on 7/4/17.
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode l3;
        if(l1 == null){
            return l2;
        }
        if(l2 == null)
            return l1;
        if(l1.val > l2.val){
            l3 = l2;
            l3.next = mergeTwoLists(l2.next, l1);
        }
        else{
            l3 = l1;
            l3.next = mergeTwoLists(l1.next, l2);
        }
        return l3;

    }
}
