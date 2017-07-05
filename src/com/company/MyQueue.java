package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Ashutosh.Purohit on 6/20/17.
 */
public class MyQueue {

    /** Initialize your data structure here. */
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    int temp = 0;

    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);



    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        temp = s2.pop();
        while (!s2.isEmpty()){
            s1.push(s2.pop());

        }

        return temp;


    }

    /** Get the front element. */
    public int peek() {
    return s1.elementAt(0);
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {

        if( s1.size() == 0){
            return true;
        }
        else{
            return false;
        }

    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

