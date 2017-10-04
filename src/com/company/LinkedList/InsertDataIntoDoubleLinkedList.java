package com.company.LinkedList;

/**
 * Created by Ashutosh.Purohit on 8/11/17.
 */
public class InsertDataIntoDoubleLinkedList {

    Node SortedInsert(Node head, int data) {

        Node prev = head;
        Node next = head.next;
        Node start = head;
        Node temp = new Node();
        temp.data = data;

        if (data < head.data){
            start.data = data;
            start.next = head;
            return start;
        }

        while (next != null){

            if (data > next.data){

                prev = next;
                next = next.next;
            }

            else if (data < next.data){
                prev.next = temp;
                temp.prev = prev;
                temp.next = next;
                return start;


            }


        }

        prev.next = temp;
        temp.prev = prev;
        return start;

    }



}
