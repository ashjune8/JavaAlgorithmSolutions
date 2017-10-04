package com.company;



import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Ashutosh.Purohit on 6/24/17.
 */
public class SummaryRanges {

    public ArrayList<String> summaryRanges(int[] nums) {
        if (nums.length == 0){
            ArrayList<String> empty = new ArrayList<String>();
            return empty;
        }

        int start = nums[0];
        int previous = nums[0];
        int current = nums[0];
        ArrayList<String> result = new ArrayList<>();
        int i =0;
        Integer[] numsinteger = new Integer[nums.length];
        while(i<nums.length){
            numsinteger[i] = nums[i];
            i++;
        }
        i = 0;

        while(i < nums.length){
            if (Arrays.asList(numsinteger).contains(current)){
                previous = current;
                current += 1;
                i+= 1;
            }
            else{
                if (start==previous){
                    result.add(String.valueOf(start));
                    start = nums[i];
                    previous = nums[i];
                    current = nums[i] + 1;
                    i = i + 1;
                }
                else{
                    result.add(String.valueOf(start) + "->"+ String.valueOf(previous));
                    start = nums[i];
                    previous = nums[i];
                    current = nums[i] + 1;
                    i = i+1;
                }


            }
        }
        if (start==previous){
            result.add(String.valueOf(start));
        }
        else {
            result.add(String.valueOf(start) + "->"+ String.valueOf(previous));
        }

        return result;



    }
}
