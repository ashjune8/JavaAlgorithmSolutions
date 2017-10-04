package com.company.General_Algorithm;

/**
 * Created by Ashutosh.Purohit on 6/10/17.
 */
public class LongestPalindrome {

    public String longestPalindrome(String s) {

        int position = 0;
        String palindrome = "";
        String maxpalindrome = "";
        String reverse ="";
        String current = "";

        while(position < s.length()){

            for(int i = position; i < s.length(); i++){

                palindrome += s.charAt(i);
                reverse = new StringBuffer(palindrome).reverse().toString();

                if (palindrome.equals(reverse)){
                    current = palindrome;
                    if (current.length() > maxpalindrome.length()){

                        maxpalindrome = current;

                    }

                }





            }
            palindrome = "";

            current = "";
            position +=1;


        }

        return maxpalindrome;
    }
}
