package com.company.CodingTest;

import java.util.*;

/**
 * Created by Ashutosh.Purohit on 4/6/18.
 */
public class AmazonTest {

    public static void main(String[] args) {

        AmazonTest amazonTest = new AmazonTest();
        String lit = "Jack and Jill's went up up up to to to the hi;;";
        List<String> exclude = Arrays.asList("and","the");

        amazonTest.retrieveMostFrequentlyUsedWords(lit,exclude);
    }


   List<String> retrieveMostFrequentlyUsedWords(String literatureText, List<String> wordsToExclude){

       String[] textblock = literatureText.split("[\\p{Punct}\\s]+");

//       test
       for(int i=0; i<textblock.length;i++){

           System.out.println(textblock[i]);
       }



       HashMap<String,Integer> wordfrequency = new HashMap<>();

       for (int i=0; i<textblock.length; i++){

           if (wordsToExclude.contains(textblock[i])){
               continue;
           }

           if(wordfrequency.containsKey(textblock[i])){
               wordfrequency.put(textblock[i],wordfrequency.get(textblock[i]) +1);
           }
           else{

               wordfrequency.put(textblock[i],1);
           }
       }

       int max =0;
       ArrayList<String> finalresult = new ArrayList<>();

       Set<String> hashmapkeys = wordfrequency.keySet();

       for ( String key : hashmapkeys) {

           if(wordfrequency.get(key) == max ){
               finalresult.add(key);
           }
           if(wordfrequency.get(key) > max){
               max = wordfrequency.get(key);
               finalresult.clear();
               finalresult.add(key);
           }
       }

//       test

       for(int i=0; i<finalresult.size();i++){

           System.out.println(finalresult.get(i));
       }

        return finalresult;
   }
}
