package com.company.General_Algorithm;

import java.util.Arrays;

/**
 * Created by Ashutosh.Purohit on 6/17/17.
 */
public class MinMoves {

    public int minMoves(int[] nums) {

        int difference = 0;
        Arrays.sort(nums);

        for(int i =nums.length-1; i >-1;i--){

            if (nums[i] == nums[0]){
                break;
            }
            difference += nums[i] - nums[0];
        }

        return difference;

    }
}
