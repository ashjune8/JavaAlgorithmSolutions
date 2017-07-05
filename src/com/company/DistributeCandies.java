package com.company;

import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Ashutosh.Purohit on 6/14/17.
 */
public class DistributeCandies {

    public int distributeCandies(int[] candies) {

        int numberofcandies = candies.length;

        List<Integer> candieslist = IntStream.of(candies).boxed().collect(Collectors.toList());
        Set<Integer> typeofcandies = new HashSet<Integer>(candieslist);
        int typeofcandieslength = typeofcandies.size();

        if (typeofcandieslength < numberofcandies/2){

            return typeofcandieslength;
        }

        else{return numberofcandies/2;}



    }
}
