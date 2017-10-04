package com.company.General_Algorithm;

/**
 * Created by Ashutosh.Purohit on 7/5/17.
 */
public class ReverseWordsII {

    public static void main(String[] args) {
        ReverseWordsII reverseWords = new ReverseWordsII();
        System.out.println(reverseWords.reverseWords("  1 "));
    }
    public String reverseWords(String s) {

        String[] stringarray = s.split("\\s");
        String reversestring = "";


        if (stringarray.length == 0){
            return "";
        }
        if (stringarray.length == 1){
            return stringarray[0];
        }
        reversestring = stringarray[stringarray.length-1];
        for(int i= stringarray.length-2;i>-1;i--){

            reversestring = reversestring + " " + stringarray[i];
        }

        return reversestring;




    }
}
