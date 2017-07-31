package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Ashutosh.Purohit on 7/15/17.
 */
public class singleNumber {

    public static void main(String[] args) {
        singleNumber singleNumber = new singleNumber();
        int[] query = {17,12,5,-6,12,4,17,-5,2,-3,2,4,5,16,-3,-4,15,15,-4,-5,-6};

        System.out.println(singleNumber.singleNumber(query));

    }

    public int singleNumber(int[] nums) {

        Arrays.sort(nums);

        if (nums.length == 1){
            return nums[0];
        }
        for (int i=1; i<nums.length -1; i++){

            if(nums[i] == nums[i-1] || nums[i] == nums[i+1]){
                continue;
            }
            else{
                return nums[i];
            }
        }

        if(nums[0] != nums[1]){
            return nums[0];
        }
        else{
            return nums[nums.length-1];
        }
    }
}
