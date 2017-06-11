package com.company;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Ashutosh.Purohit on 6/9/17.
 */
public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int lenA = nums1.length;
        int lenB = nums2.length;
        ArrayList<Integer> combarrlist = new ArrayList<Integer>();

        for (int i = 0; i < lenA; i++) {
            combarrlist.add(nums1[i]);

        }


        for (int i = 0; i < lenB; i++) {
            combarrlist.add(nums2[i]);

        }


        for (int j = combarrlist.size() - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (combarrlist.get(i) > combarrlist.get(i + 1)) {
                    int temp = combarrlist.get(i);
                    combarrlist.set(i, combarrlist.get(i + 1));
                    combarrlist.set(i + 1, temp);
                }


            }
        }



        if (combarrlist.size()%2 == 0 ){
            int med1;
            int med2;
            med1 = combarrlist.get(combarrlist.size()/2);
            med2 = combarrlist.get((combarrlist.size()/2) - 1);

            return (double) (med1+med2)/2;

        }
        else{

            return (double) combarrlist.get((combarrlist.size())/2);
        }


    }
}
