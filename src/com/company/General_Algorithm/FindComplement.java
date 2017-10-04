package com.company.General_Algorithm;

/**
 * Created by Ashutosh.Purohit on 6/11/17.
 */
public class FindComplement {

    public int findComplement(int num) {

        String binstring = Integer.toBinaryString(num);
        String comstring = "";

        for (int i =0; i < binstring.length(); i++){


            if (binstring.charAt(i) == '0'){
                comstring += "1";


            }
            else{

                comstring += "0";
            }


        }
    return Integer.parseInt(comstring,2);
    }
}
