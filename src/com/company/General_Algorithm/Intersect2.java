package com.company.General_Algorithm;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Ashutosh.Purohit on 6/17/17.
 */
public class Intersect2 {
    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> resultlist = new ArrayList<Integer>();
        List<Integer> nums1list = IntStream.of(nums1).boxed().collect(Collectors.toList());
        Set<Integer> nums1set = new HashSet<Integer>(nums1list);

        List<Integer> nums2list = IntStream.of(nums2).boxed().collect(Collectors.toList());
        Set<Integer> nums2set = new HashSet<Integer>(nums2list);

        Set<Integer> intersection = new HashSet<Integer>(nums1set);
        intersection.retainAll(nums2set);
        Integer[] integerarrintersection = new Integer[intersection.size()];
        integerarrintersection = intersection.toArray(new Integer[intersection.size()]);
        int count = 0;
        int i =0;
        while (i<integerarrintersection.length){
            if (Collections.frequency(nums1list,integerarrintersection[i]) == Collections.frequency(nums2list,integerarrintersection[i])){

                count = Collections.frequency(nums1list,integerarrintersection[i]);
                while(count>0){
                    resultlist.add(integerarrintersection[i]);
                    count--;
                }
                count = 0;
            }
            if (Collections.frequency(nums1list,integerarrintersection[i]) > Collections.frequency(nums2list,integerarrintersection[i])){

                count = Collections.frequency(nums2list,integerarrintersection[i]);
                while(count>0){
                    resultlist.add(integerarrintersection[i]);
                    count--;
                }
                count = 0;
            }
            if (Collections.frequency(nums1list,integerarrintersection[i]) < Collections.frequency(nums2list,integerarrintersection[i])){

                count = Collections.frequency(nums1list,integerarrintersection[i]);
                while(count>0){
                    resultlist.add(integerarrintersection[i]);
                    count--;
                }
                count = 0;
            }
            i++;
        }
    i = 0;
    int[] result = new int[resultlist.size()];
        while(i<resultlist.size()){

            result[i] = resultlist.get(i);
            i++;

        }
        return result;
    }
}
