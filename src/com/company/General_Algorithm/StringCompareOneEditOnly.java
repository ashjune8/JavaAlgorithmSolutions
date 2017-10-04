package com.company.General_Algorithm;

/**
 * Created by Ashutosh.Purohit on 8/10/17.
 */
public class StringCompareOneEditOnly {

    public static void main(String[] args) {

        String string1 = "pale";
        String string2 = "PAle";
        StringCompareOneEditOnly stringCompareOneEditOnly = new StringCompareOneEditOnly();
        System.out.println(stringCompareOneEditOnly.stringcompareoneeditonly(string1,string2));
    }

    private boolean stringcompareoneeditonly(String string1, String string2){

        int editrequired = 0;

        if (Math.abs(string1.length() - string2.length()) > 1){return false;}

        int j = 0;
        int i = 0;

        if (string1.length() > string2.length()){

            while(i<string1.length()){

                if (string1.charAt(i)==string2.charAt(j)){

                    i++;
                    j++;
                }

                else{
                    editrequired++;
                    i++;
                }

            }

            if (editrequired>1){return false;}
            else return true;

        }

        if (string1.length() < string2.length()){

            while(i<string2.length()){

                if (string2.charAt(i)==string1.charAt(j)){

                    i++;
                    j++;
                }

                else{
                    editrequired++;
                    i++;
                }

            }

            if (editrequired>1){return false;}
            else return true;

        }

        if (string1.length() == string2.length()){

            while(i<string2.length()){

                if (string2.charAt(i)==string1.charAt(j)){

                    i++;
                    j++;
                }

                else{
                    editrequired++;
                    i++;
                    j++;
                }

            }

            if (editrequired>1){return false;}
            else return true;

        }


    return false;
    }
}
