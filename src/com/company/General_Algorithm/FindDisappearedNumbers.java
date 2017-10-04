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
public class FindDisappearedNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {


        List<Integer> numslist = IntStream.of(nums).boxed().collect(Collectors.toList());
        Set<Integer> numsset = new HashSet<Integer>(numslist);

        Set<Integer> fulllist = new HashSet<Integer>();
        for (int i = 1; i< nums.length + 1; i++){

            fulllist.add(i);

        }

        Set<Integer> intersection = new HashSet<Integer>(fulllist);
        intersection.removeAll(numsset);

        ArrayList<Integer> result = new ArrayList<Integer>(intersection);

        return result;

    }
}
