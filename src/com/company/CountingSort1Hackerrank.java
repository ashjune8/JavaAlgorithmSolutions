package com.company;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Ashutosh.Purohit on 9/11/17.
 */
public class CountingSort1Hackerrank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numbers = in.nextInt();

        HashMap<Integer,Integer> dict = new HashMap<>();
        int input;

        for (int i =0; i<numbers;i++){
            input = in.nextInt();
            if(!dict.containsKey(input)){
                dict.put(input,1);
            }
            else{
                dict.put(input,dict.get(input)+1);
            }

        }

        for (int i =0; i< numbers;i++){
            if (dict.containsKey(i)){
                System.out.print(dict.get(i) + " ");
            }
            else System.out.print(0 + " ");
        }


    }
}
