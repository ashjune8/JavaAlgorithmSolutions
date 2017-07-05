package com.company;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Ashutosh.Purohit on 6/18/17.
 */
public class FindMin {

    public int findMin(int[] nums) {

        List<Integer> numslist = IntStream.of(nums).boxed().collect(Collectors.toList());
        Collections.sort(numslist);
        return numslist.get(0);

    }
}
