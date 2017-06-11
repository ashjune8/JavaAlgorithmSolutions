package com.company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Ashutosh.Purohit on 6/11/17.
 */
public class ArrayPairSum {

    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);

        ArrayList<Integer> newarraylist = new ArrayList<Integer>();

        int sum = 0;

        for (int i = 0; i < nums.length; i++){

            if (i%2 == 0){
                newarraylist.add(nums[i]);


            }
        }

        for (int i = 0; i< newarraylist.size(); i++){

            sum += newarraylist.get(i);

        }

        return sum;

    }
}
