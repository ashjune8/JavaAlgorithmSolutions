package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Ashutosh.Purohit on 7/24/17.
 */
public class CalcEquation {

    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {

        HashMap<String,HashMap<String,Double>> dictofdict = new HashMap();
        double [] result = new double[queries.length];

        for(int i = 0 ; i<equations.length; i++){

            if(!dictofdict.containsKey(equations[i][0])){
                dictofdict.put(equations[i][0], new HashMap<>());
            }
            dictofdict.get(equations[i][0]).put(equations[i][1],values[i]);

            if(!dictofdict.containsKey(equations[i][1])){
                dictofdict.put(equations[i][1], new HashMap<>());
            }
            dictofdict.get(equations[i][1]).put(equations[i][0],1/values[i]);
        }

        for(int i=0;i<queries.length;i++){
            result[i] = findpath(dictofdict,queries[i][0],queries[i][1]);
        }

        return result;



    }


    public double findpath(HashMap<String,HashMap<String,Double>> dictofdict, String start, String end){

        if(!dictofdict.containsKey(start) || !dictofdict.containsKey(end)){
            return -1.00;
        }
        if(start == end){
            return 1.00;
        }

        ArrayList<String> visited = new ArrayList<>();

        return findresult(visited,dictofdict,start,end);

    }

    public double findresult(ArrayList<String> visited,HashMap<String,HashMap<String,Double>> dictofdict, String start, String end ){

        if(!visited.contains(start)){
            visited.add(start);
        }
        if(dictofdict.get(start).containsKey(end)){
            return dictofdict.get(start).get(end);
        }
        else{

            HashSet<String> dictofdicthashset = new HashSet<>(dictofdict.get(start).keySet());
            HashSet<String> visitedhashset = new HashSet<>(visited);
            dictofdicthashset.removeAll(visited);
            if (dictofdicthashset.isEmpty()){
                return -1.00;
            }
            String [] dictofdicthashsetstring = new String[dictofdicthashset.size()];
            dictofdicthashset.toArray(dictofdicthashsetstring);
            for(int i =0; i < dictofdicthashset.size(); i++){
                Double temp;
                temp = findresult(visited,dictofdict,start,dictofdicthashsetstring[i])*findresult(visited,dictofdict,dictofdicthashsetstring[i],end);
                if(temp<0){
                    continue;
                }
                else{
                    return temp;
                }
            }
            return -1.00;
        }
    }
}
