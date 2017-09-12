package com.company;
import java.io.*;
import java.util.*;
/**
 * Created by Ashutosh.Purohit on 7/28/17.
 */
public class LeftRotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);
        String[] rotationcountstring = new String[2];
        int rotationcount;
        int originalarraysize;
        rotationcountstring = input.nextLine().split("\\s");
        originalarraysize = Integer.valueOf(rotationcountstring[0]);
        rotationcount = Integer.valueOf(rotationcountstring[1]);

        String[] originalarray = new String[originalarraysize];
        originalarray = input.nextLine().split("\\s");

        ArrayList<String> originalarraylist = new ArrayList<String>();
        for(int i =0;i<originalarraysize;i++){
            originalarraylist.add(originalarray[i]);
        }

        LeftRotation leftRotation = new LeftRotation();
        for(int i=0; i<rotationcount;i++){
            originalarraylist = leftRotation.leftrotation(originalarraylist);
        }

        System.out.println(String.join(" ",originalarraylist));


    }

    public ArrayList<String> leftrotation(ArrayList<String> arr){

        String temp;
        temp = arr.remove(0);
        arr.add(temp);

        return arr;

    }
}
