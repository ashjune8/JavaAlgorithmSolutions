package com.company.CodingTest;

/**
 * Created by Ashutosh.Purohit on 9/28/17.
 */
public class SecondSmallestGSHAckerrank {

    static int secondSmallest(int[] x) {
        if(x.length < 2)
            return 0;
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for(int i = 0; i < x.length; i++){
            if(x[i] < min){
                secondMin = min;
                min = x[i];
            }
            else if(x[i] == min || x[i] < secondMin)
                secondMin = x[i];
        }
        return secondMin;

    }
}
