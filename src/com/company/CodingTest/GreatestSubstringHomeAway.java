package com.company.CodingTest;

/**
 * Created by Ashutosh.Purohit on 9/28/17.
 */
public class GreatestSubstringHomeAway {

    public static void main(String[] args) {

        GreatestSubstringHomeAway greatestSubstringHomeAway = new GreatestSubstringHomeAway();
        String s = "bbbbb";
        System.out.println(compute(s));

    }

    static String compute(String s){

        int index =0;
        char maximumchar = s.charAt(0);

        for (int i=0; i<s.length()-1;i++){

            if(s.charAt(i) >= s.charAt(i+1)){

                if (s.charAt(i) > maximumchar){

                    maximumchar = s.charAt(i);
                    index = i;
                }

            }


        }
        return s.substring(index);

    }
}
