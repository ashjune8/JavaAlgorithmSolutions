package com.company;

/**
 * Created by Ashutosh.Purohit on 6/20/17.
 */
public class FindMaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int currentcount =0;
        int maxcount =0;
        int i =0;
        while(i<nums.length){
            if (nums[i] == 1){
                currentcount ++;

            }
            else{
                maxcount = Math.max(maxcount,currentcount);
                currentcount = 0;
            }
            i++;
        }
    return Math.max(maxcount,currentcount);
    }
}
