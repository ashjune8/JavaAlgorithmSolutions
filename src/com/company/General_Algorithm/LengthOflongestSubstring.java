package com.company.General_Algorithm;

import java.util.ArrayList;


/**
 * Created by Ashutosh.Purohit on 6/7/17.
 */
public class LengthOflongestSubstring {

    public int lengthOfLongestSubstring(String s) {



        ArrayList <Character> visited = new ArrayList<Character>();
        int currentcount = 0;
        int maxcount = 0;
        int position = 0;


        while (position < s.length()){

            for (int i = position ; i< s.length() ; i++ ){

                if (visited.contains(s.charAt(i))) {
                    currentcount = 0;
                    visited.clear();

                    position += 1;

                    break;
                    }
                else {
                    visited.add(s.charAt(i));
                    currentcount += 1;
                    if (currentcount >= maxcount){
                        maxcount = currentcount;
                    }



                }
                }




                }

        return maxcount;

            }
        }




