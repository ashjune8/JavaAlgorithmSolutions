package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ashutosh.Purohit on 6/11/17.
 */
public class FindWords {

    public String[] findWords(String[] words) {

        String[] wordlist = {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
        Set<Character> wordlist1 = new HashSet<Character>();
        Set<Character> wordlist2 = new HashSet<Character>();
        Set<Character> wordlist3 = new HashSet<Character>();
        Set<Character> testword = new HashSet<Character>();

        int i = 0;
        while (  i < wordlist[0].length()){
            wordlist1.add(wordlist[0].toLowerCase().toCharArray()[i]);
            i ++;
        }
        i = 0;
        while (  i < wordlist[1].length()){
            wordlist2.add(wordlist[1].toLowerCase().toCharArray()[i]);

            i ++;
        }
        i = 0;
        while (  i < wordlist[2].length()){
            wordlist3.add(wordlist[2].toLowerCase().toCharArray()[i]);
            i ++;
        }
        i = 0;

        int position = 0;
        ArrayList<String> found = new ArrayList<String>();

        while (position < words.length) {

            while (  i < words[position].length()){
                testword.add(words[position].toLowerCase().toCharArray()[i]);
                i ++;
            }
            i = 0;

            Set<Character> intersection1 = new HashSet<Character>(wordlist1);
            intersection1.retainAll(testword);
            if (intersection1.size() == testword.size()){
                found.add(words[position]);

            }

            Set<Character> intersection2 = new HashSet<Character>(wordlist2);
            intersection2.retainAll(testword);
            if (intersection2.size() == testword.size()){
                found.add(words[position]);

            }
            Set<Character> intersection3 = new HashSet<Character>(wordlist3);
            intersection3.retainAll(testword);
            if (intersection3.size() == testword.size()){
                found.add(words[position]);

            }
            position += 1;
            testword.clear();

        }




        return found.toArray(new String[found.size()]);
    }
}
