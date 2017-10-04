package com.company.General_Algorithm;

/**
 * Created by Ashutosh.Purohit on 6/16/17.
 */
public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int position = 0;
        int product = 1;
        int[] result = new int[nums.length];
        int i = 0;
        int[] nullresult = new int[nums.length];
        while (i<nums.length){
            if(i==position && position == nums.length -1 ){
                result[position] = product;
                return result;
            }

            if(i==position && position != nums.length -1){
                i++;
                continue;
            }
            if(i== nums.length-1 && position != nums.length-1){
                product *= nums[i];
                result[position] = product;
                product = 1;
                i = 0;
                position += 1;


            }

            else{
                product *= nums[i];
                i++;
            }

        }


    return nullresult;
    }
}
