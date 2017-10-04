package com.company.General_Algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Ashutosh.Purohit on 6/16/17.
 */
public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> nums1list = IntStream.of(nums1).boxed().collect(Collectors.toList());
        Set<Integer> nums1set = new HashSet<Integer>(nums1list);

        List<Integer> nums2list = IntStream.of(nums2).boxed().collect(Collectors.toList());
        Set<Integer> nums2set = new HashSet<Integer>(nums2list);

        Set<Integer> intersection = new HashSet<Integer>(nums1set);
        intersection.retainAll(nums2set);
        Integer[] integerarrintersection = new Integer[intersection.size()];
        integerarrintersection = intersection.toArray(new Integer[intersection.size()]);


        int[] result = new int[intersection.size()];
        for (int i =0; i < intersection.size();i++){

            result[i] = integerarrintersection[i];


        }
        return result;





    }
}
