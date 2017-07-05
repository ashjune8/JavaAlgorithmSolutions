package com.company;

import java.util.Stack;

/**
 * Created by Ashutosh.Purohit on 6/20/17.
 */
public class ValidParenthesis {
    public boolean isValid(String s) {


        Stack<Character> stack = new Stack<Character>();
        int i =0;
        if (s.length() == 1 || s.length() == 0 || s.length()%2 != 0){
            return false;
        }

        Character temp;


        while(i < s.length()){

            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
                i++;
                continue;
            }

            if((s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')&& !stack.isEmpty() ){

                temp = stack.pop();
                if (temp == '(' && s.charAt(i) == ')'){
                    i++;
                    continue;
                }
                if (temp == '[' && s.charAt(i) == ']'){
                    i++;
                    continue;
                }
                if (temp == '{' && s.charAt(i) == '}'){
                    i++;
                    continue;
                }
                


            }
            else{
                return false;
            }
        }
    return stack.isEmpty();
    }
}
