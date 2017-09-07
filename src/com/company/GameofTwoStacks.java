package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Ashutosh.Purohit on 8/24/17.
 */
public class GameofTwoStacks {

    public static void main(String[] args) {
        GameofTwoStacks gameofTwoStacks = new GameofTwoStacks();
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            Stack<Integer> a = new Stack<>();
            for(int a_i=0; a_i < n; a_i++){
                a.add(in.nextInt());
            }
            Stack<Integer> b = new Stack<>();
            for(int b_i=0; b_i < m; b_i++){
                b.add(in.nextInt());
            }
            // your code goes here

            int score;
            score = 0;
            int sum;
            sum = 0;

            score = gameofTwoStacks.maxscore(a,b,sum,x,score);

            System.out.println(score);





        }

    }

    public int maxscore(Stack<Integer> a, Stack<Integer> b, int sum, int x, int score){
        if (a.size() > 0 && b.size() > 0 && a.elementAt(0) < b.elementAt(0) && sum + a.elementAt(0) < x){
            sum += a.elementAt(0);
            a.pop();
            score ++;
            return maxscore(a,b,sum,x,score);

        }
        else if (a.size() > 0 && b.size() > 0 && a.elementAt(0) > b.elementAt(0) && sum + b.elementAt(0) < x){
            sum += b.elementAt(0);
            b.pop();
            score ++;
            return maxscore(a,b,sum,x,score);

        }

        else if (a.size() > 0 && b.size() > 0 && a.elementAt(0) == b.elementAt(0) && sum + a.elementAt(0) < x){
            if (a.size() > 1 && b.size() > 1 && a.elementAt(1) < b.elementAt(1)  ){
                sum += a.elementAt(0);
                a.pop();
                score ++;
                return maxscore(a,b,sum,x,score);
            }
            else if (a.size() > 1 && b.size() > 1 && a.elementAt(1) > b.elementAt(1)  ){
                sum += b.elementAt(0);
                b.pop();
                score ++;
                return maxscore(a,b,sum,x,score);
            }
            else if (a.size() <= 1){
                sum += b.elementAt(0);
                b.pop();
                score ++;
                return maxscore(a,b,sum,x,score);

            }
            else if (b.size() <= 1 ){
                sum += a.elementAt(0);
                a.pop();
                score ++;
                return maxscore(a,b,sum,x,score);

            }
        }

        else if (a.size() == 0 && sum + b.elementAt(0) < x ){

            sum += b.elementAt(0);
            b.pop();
            score ++;
            return maxscore(a,b,sum,x,score);
        }

        else if (b.size() == 0 && sum + a.elementAt(0) < x ){
            sum += a.elementAt(0);
            a.pop();
            score ++;
            return maxscore(a,b,sum,x,score);
        }
        else{
            return score;
        }
    return -1;
    }
}
