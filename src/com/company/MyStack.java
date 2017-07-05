package com.company;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Ashutosh.Purohit on 6/21/17.
 */
public class MyStack {


    /** Initialize your data structure here. */

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    int temp = 0;





    /** Push element x onto stack. */
    public void push(int x) {
        queue1.add(x);



    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (queue1.size() > 1){
            queue2.add(queue1.remove());

        }

        temp = queue1.remove();

        while(queue2.size()>0){
            queue1.add(queue2.remove());

        }


        return temp;


    }

    /** Get the top element. */
    public int top() {
        while (queue1.size()>1){
            queue2.add(queue1.remove());

        }

        temp = queue1.remove();

        while(queue2.size()>0){
            queue1.add(queue2.remove());

        }

        queue1.add(temp);
        return temp;

    }

    /** Returns whether the stack is empty. */
    public boolean empty() {

        return queue1.isEmpty();

    }
}

/**
 *
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */