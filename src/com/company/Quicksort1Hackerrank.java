package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by Ashutosh.Purohit on 9/11/17.
 */
public class Quicksort1Hackerrank {

    static void partition(int[] ar) {

        int p = ar[0];
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        equal.add(p);
        for(int i =1; i< ar.length;i++){
            if (ar[i] <p){
                left.add(ar[i]);
            }
            else if(ar[i]>p){
                right.add(ar[i]);
            }
            else{
                equal.add(ar[i]);
            }

        }

        int[] leftintarray = new int[left.size()];
        for (int i=0; i< left.size();i++){
            leftintarray[i] = left.get(i);
        }
        int[] rightintarray = new int[right.size()];
        for (int i=0; i< right.size();i++){
            rightintarray[i] = right.get(i);
        }
        int[] equalintarray = new int[equal.size()];
        for (int i=0; i< equal.size();i++){
            equalintarray[i] = equal.get(i);
        }

        System.arraycopy(leftintarray,0,ar,0,leftintarray.length);
        System.arraycopy(equalintarray,0,ar,leftintarray.length,equalintarray.length);
        System.arraycopy(rightintarray,0,ar,leftintarray.length+equalintarray.length,rightintarray.length);


    }

    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        int j =0;
        while (j<ar.length-1){
            if (ar[j] > ar[j+1]){
                partition(ar);
                j = 0;
            }
            else{
                j++;
            }

        }

        printArray(ar);
    }
}
