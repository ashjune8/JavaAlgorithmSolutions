package com.company;

/**
 * Created by Ashutosh.Purohit on 6/16/17.
 */
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {

        int [] result = new int[2];

        int left = 0;
        int right = numbers.length - 1;
        int [] nullresult= new int[2];

        for ( int i =0; i < numbers.length; i++){

            if (numbers[left] + numbers[right] > target){

                right--;
            }

            if ( numbers[left] + numbers[right] < target){

                left++;
            }

            if(( numbers[left] + numbers[right]) == target){

                result[0] = left + 1;
                result[1] = right + 1;
                return result;
            }

        }


        return nullresult;
    }
}
