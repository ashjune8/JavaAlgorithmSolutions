package com.company;

import javax.print.DocFlavor;

/**
 * Created by Ashutosh.Purohit on 7/15/17.
 */
public class DetectCapitalUse {

    public static void main(String[] args) {

        DetectCapitalUse detectCapitalUse = new DetectCapitalUse();

        String query = "USA";
        System.out.println(detectCapitalUse.detectCapitalUse(query));
    }

    public boolean detectCapitalUse(String word) {

        if (word.length()==1){
            return true;
        }
        String test;
        test = word.toLowerCase();

        int i =1;
        if(word.charAt(0) == test.charAt(0)) {
            while(i<word.length()){
                if (word.charAt(i) != test.charAt(i)){
                    return false;
                }
                i++;
            }
            return true;
        }
        else if(word.charAt(1) != test.charAt(1)) {
            i =2;
            while(i<word.length()){
                if (word.charAt(i) == test.charAt(i)){
                    return false;
                }
                i++;
            }
            return true;
        }
        else{
            i =1;
            while(i<word.length()){
                if (word.charAt(i) != test.charAt(i)){
                    return false;
                }
                i++;
            }
            return true;
        }

    }
}
