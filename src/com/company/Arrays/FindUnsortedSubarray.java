package com.company.Arrays;

import java.util.Arrays;

/**
 * Created by Ashutosh.Purohit on 6/27/17.
 */
public class FindUnsortedSubarray {

    public int findUnsortedSubarray(int[] nums) {

        int[] unsortedarray = new int[nums.length];
        unsortedarray = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        int left =0;
        int right = nums.length-1;

        while (left<right){

            if (unsortedarray[left]==nums[left]){
                left++;
            }
            if (unsortedarray[right]==nums[right]){
                right--;
            }
            if ((unsortedarray[right]!=nums[right]) &&(unsortedarray[left]!=nums[left]) ){
                return right-left+1;
            }
        }

        return 0;



    }
}
