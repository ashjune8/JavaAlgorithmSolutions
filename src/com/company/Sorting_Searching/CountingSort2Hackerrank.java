package com.company.Sorting_Searching;

import java.util.HashMap;
import java.util.Scanner;

public class CountingSort2Hackerrank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);
        long numbers = in.nextLong();

        HashMap<Long, Long> dict = new HashMap<>();
        long input;

        for (long i = 0; i < numbers; i++) {
            input = in.nextLong();
            if (!dict.containsKey(input)) {
                dict.put(input, 1L);
            } else {
                dict.put(input, dict.get(input) + 1L);
            }

        }

        long j = 0;

        for (long i = 0; i < 100; i++) {
            if (dict.containsKey(i)) {
                j = dict.get(i);
                while (j > 0) {
                    System.out.print(i + " ");
                    j--;
                }
            }
        }
    }
}
