package com.company;

/**
 * Created by Ashutosh.Purohit on 6/11/17.
 */
public class ReverseWords {

    public String reverseWords(String s) {

        String[] newarray = s.split(" ");
        String reversed = "";

        String testreverse;

        for (int i =0; i < newarray.length; i++ ){

            testreverse = new StringBuffer(newarray[i]).reverse().toString();
            if ( i == newarray.length - 1){


                reversed += testreverse;
            }

            else{

                reversed += testreverse + " ";
            }

        }

        return reversed;

    }
}
