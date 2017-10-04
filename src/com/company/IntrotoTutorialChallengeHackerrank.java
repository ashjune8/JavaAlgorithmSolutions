package com.company;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

public class IntrotoTutorialChallengeHackerrank {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
       for(int i = 0; i<n;i++){
           arr[i] = scanner.nextInt();
       }

        int index;
        index = Arrays.asList(arr).indexOf(v);
        System.out.println(index);

    }
}
