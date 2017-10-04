package com.company.General_Algorithm;

import java.util.Arrays;

/**
 * Created by Ashutosh.Purohit on 6/18/17.
 */
public class NextGreaterElement {

    public int[] nextGreaterElement(int[] findNums, int[] nums) {


        Integer[] findNumsInteger = new Integer[findNums.length];
        Integer[] numsInteger = new Integer[nums.length];
        int [] result = new int[findNums.length];
        int i =0;
        int j=0;
        while (i<findNums.length){
            findNumsInteger[i] = findNums[i];
            i++;
        }
        i = 0;
        while(i<nums.length){
            numsInteger[i] = nums[i];
            i++;
        }
        i=0;
        while (i<findNumsInteger.length){
            if (Arrays.asList(numsInteger).indexOf(findNumsInteger[i])+j == nums.length - 1){
                result[i] = -1;
                i++;
                j=0;

            }
            else if  (nums[Arrays.asList(numsInteger).indexOf(findNumsInteger[i])+j+1] > findNums[i]){
                result[i] = nums[Arrays.asList(numsInteger).indexOf(findNumsInteger[i])+j+1];
                i ++;
                j = 0;

            }
            else{
                j++;
            }


        }

    return result;
    }
}
