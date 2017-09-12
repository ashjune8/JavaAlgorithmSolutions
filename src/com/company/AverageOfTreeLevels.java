package com.company;

import java.util.ArrayList;
import java.util.Queue;

/**
 * Created by Ashutosh.Purohit on 7/10/17.
 */
public class AverageOfTreeLevels {

    public ArrayList<Double> averageOfLevels(TreeNode root) {

        ArrayList<Double> result = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();

        double temp = 0;
        double sum = 0;
        double nonecount = 0;
        queue.add(0, root);

        while (!queue.isEmpty()){

            temp = queue.size();

            for (int i = 0; i< temp; i++){

                if (queue.get(queue.size()-1) == null){
                    queue.remove(queue.size()-1);
                    nonecount ++;
                    continue;
                }
                else{
                    queue.add(0,queue.get(queue.size()-1).left);
                    queue.add(0,queue.get(queue.size()-1).right);
                    sum += queue.remove(queue.size()-1).val;

                }

            }

            if (temp == nonecount){
                break;
            }
            result.add(sum/(temp-nonecount));
            sum = 0;
            nonecount = 0;
        }
        return result;




    }
}
