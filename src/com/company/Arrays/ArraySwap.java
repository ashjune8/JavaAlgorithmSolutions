package com.company.Arrays;

import java.util.Arrays;

/**
 * Created by Ashutosh.Purohit on 3/31/18.
 */
public class ArraySwap {

    public static void main(String[] args) {

        ArraySwap arraySwap = new ArraySwap();

        int[] A = new int[] {1,3,5,3,4};

        System.out.println(arraySwap.solution(A));

    }


    public boolean solution(int[] A) {
        // write your code in Java SE 8


        int[] sortedarray = Arrays.copyOf(A,A.length);
        Arrays.sort(sortedarray);

        for(int i=0; i<A.length -1;i++ ){

            if (A[i] < A[i+1]){

                continue;
            }

            else{
                for (int j=i+1;j<A.length;j++) {
                    if (Arrays.equals(sortedarray,swap(i,j, A))) {
                        return true;

                    }

                }

            }


        }
        return false;
    }


    public int[] swap(int i,int j, int[] A){

        int[] B = new int[A.length];
        B = Arrays.copyOf(A,A.length);
        int temp = B[i];
        B[i] = B[j];
        B[j] = temp;

        return B;


    }






}
