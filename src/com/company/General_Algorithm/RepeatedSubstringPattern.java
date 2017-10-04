package com.company.General_Algorithm;



import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Ashutosh.Purohit on 6/19/17.
 */
public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {

        String checkstring = new String();
        String temp = new String();
        Set<Character> characterSet = new HashSet<Character>();
        int i =0;
        if (s.length() == 0 || s.length() == 1){
            return false;
        }
        while (i<s.length()){
            characterSet.add(s.toCharArray()[i]);
            if (characterSet.size() > 2){
                break;
            }
            i++;

        }



        if (characterSet.size() == 1){
            return true;
        }

        else{

            checkstring = s.substring(0,s.length()/2);
            temp = checkstring+checkstring;
            if(temp.equals(s)){
                return true;
            }
            else{

                checkstring = s.substring(0,s.length()/3);
                temp = checkstring+checkstring+checkstring;
                if (temp.equals(s)){

                    return true;
                }
            }
        }
    return false;
    }
}
