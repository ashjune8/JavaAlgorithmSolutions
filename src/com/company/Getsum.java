package com.company;

/**
 * Created by Ashutosh.Purohit on 6/18/17.
 */
public class Getsum {

    public int getSum(int a, int b) {

        while (b != 0) {
            int c = ((a & b) << 1);
            a ^= b;
            b = c;
        }
        return a;

    }
}
