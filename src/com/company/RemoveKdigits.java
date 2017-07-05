package com.company;

/**
 * Created by Ashutosh.Purohit on 6/27/17.
 */
public class RemoveKdigits {
    public String removeKdigits(String num, int k) {
        int i =0;
        while(k>0){
            k-=1;
            i =0;
            while(i<num.length()-1){
                if(num.charAt(i) > num.charAt(i+1)){
                    break;
                }
                i ++;

            }
            num = num.substring(0,i) + num.substring(i+1);



        }
        if(num.length()==0){
            return "0";
        }
        else{
        int intresult =  Integer.parseInt(num);
        return String.valueOf(intresult);}

    }
}
