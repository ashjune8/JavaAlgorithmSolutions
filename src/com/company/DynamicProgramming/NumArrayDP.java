package com.company.DynamicProgramming;

/**
 * Created by Ashutosh.Purohit on 8/29/17.
 */
public class NumArrayDP {
    int[] nums;

    public void NumArray(int[] nums) {


        for (int i =1;i<nums.length;i++){

            nums[i] += nums[i-1];
        }

        this.nums = nums;

    }

    public int sumRange(int i, int j) {

        if(i == 0)
            return nums[j];

        return nums[j] - nums[i - 1];



    }
}
