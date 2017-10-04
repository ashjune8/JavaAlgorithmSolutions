package com.company.General_Algorithm;

import java.util.Arrays;

/**
 * Created by Ashutosh.Purohit on 7/15/17.
 */
public class FindTheDifference {

    public static void main(String[] args) {
        FindTheDifference findTheDifference = new FindTheDifference();

        System.out.println(findTheDifference.findTheDifference("abcd","abcde"));
    }

    public char findTheDifference(String s, String t) {

        char[] sarray = s.toCharArray();
        Arrays.sort(sarray);
        String sorteds = String.valueOf(sarray);

        char[] tarray = t.toCharArray();
        Arrays.sort(tarray);
        String sortedt = String.valueOf(tarray);
        if (s.length() == 0){
            return sortedt.charAt(0);
        }

        int i =0;
        while(i<sortedt.length()-1){
            if(sorteds.charAt(i) != sortedt.charAt(i)){
                return sortedt.charAt(i);
            }
            i++;
        }
        return sortedt.charAt(sortedt.length()-1);




    }
}

