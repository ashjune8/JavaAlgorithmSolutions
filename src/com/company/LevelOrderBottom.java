package com.company;

import apple.laf.JRSUIUtils;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Ashutosh.Purohit on 7/19/17.
 */
public class LevelOrderBottom {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {


        List<List<Integer>> listoflist = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();

        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(0,root);
        int temp;

        while(!queue.isEmpty()){

            temp = queue.size();
            for(int i =0;i<temp;i++){
                if (queue.get(i) == null){
                    continue;
                }
                lst.add(0,queue.get(i).val);
            }
            listoflist.add(lst);
            lst = new ArrayList<>();



            for(int i = 0;i<temp;i++){
                if(queue.get(queue.size()-1)==null){
                    queue.remove(queue.size()-1);
                    continue;
                }
                else{
                    queue.add(0,queue.get(queue.size()-1).left);
                    queue.add(0,queue.get(queue.size()-1).right);
                    queue.remove(queue.size()-1);
                }
            }


        }


        listoflist.remove(listoflist.size()-1);
        Collections.reverse(listoflist);
        return listoflist;

    }
}
