package com.company;

import java.util.*;

/**
 * Created by Ashutosh.Purohit on 6/14/17.
 */
public class FindRestaurant {

    public String[] findRestaurant(String[] list1, String[] list2) {

        Set<String> setlist1 = new HashSet<String>(Arrays.asList(list1));
        Set<String> setlist2 = new HashSet<String>(Arrays.asList(list2));
        ArrayList<String> resultlist = new ArrayList<>();
        int indexsum = 0;
        int minsum = 0;
        ArrayList<Integer> sumlist = new ArrayList<Integer>();
        Set<String> intersection = new HashSet<String>(setlist1);
        intersection.retainAll(setlist2);
        ArrayList<String> intersectionlist = new ArrayList<String>(intersection);
        int i = 0;
        minsum = Arrays.asList(list1).indexOf(intersectionlist.get(0)) + Arrays.asList(list2).indexOf(intersectionlist.get(0));
        resultlist.add(intersectionlist.get(0));
        i = 1;
        while(i<intersectionlist.size()){
            indexsum = Arrays.asList(list1).indexOf(intersectionlist.get(i)) + Arrays.asList(list2).indexOf(intersectionlist.get(i));


            if (indexsum < minsum){

                resultlist.clear();;
                resultlist.add(intersectionlist.get(i));
                minsum = indexsum;
            }

            if (indexsum == minsum){

                resultlist.add(intersectionlist.get(i));


            }


        i++;
        }









    Set<String> resultset = new HashSet<String>(resultlist);
    ArrayList<String> finalresultset = new ArrayList<String>(resultset);

    return finalresultset.toArray(new String[finalresultset.size()]);

    }
}
