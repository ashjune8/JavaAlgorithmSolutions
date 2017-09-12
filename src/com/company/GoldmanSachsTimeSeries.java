package com.company;

import java.util.Scanner;

/**
 * Created by Ashutosh.Purohit on 8/19/17.
 */
public class GoldmanSachsTimeSeries {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int[] t = new int[n];
        for(int t_i = 0; t_i < n; t_i++){
            t[t_i] = in.nextInt();
        }
        int[] p = new int[n];
        for(int p_i = 0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < q; a0++){
            int _type = in.nextInt();
            int v = in.nextInt();
            if(_type == 1){
                boolean status = false;
                for(int i =0; i< t.length; i++){
                    if (p[i] >= v){
                        System.out.println(t[i]);
                        status = true;
                        break;
                    }

                }
                if (status == false){
                    System.out.println(-1);
                }
            }
            else{
                boolean status = false;
                int maximum = Integer.MIN_VALUE;
                int indextotake = 0;
                for(int i = 0;i< t.length;i++){
                    if(t[i]>= v){
                        indextotake = i;
                        status = true;
                        break;
                    }
                }
                if (status == false){
                    System.out.println(-1);
                    break;
                }
                else {
                    for (int i = indextotake; i < t.length; i++) {
                        maximum = Math.max(maximum, p[i]);

                    }
                    System.out.println(maximum);
                }
            }




        }
        in.close();
    }

    public void correctoutput(int[] t, int[] p, int _type, int v){
        if(_type == 1){
            boolean status = false;
            for(int i =0; i< t.length; i++){
                if (p[i] >= v){
                    System.out.println(t[i]);
                    status = true;
                    break;
                }

            }
            if (status == false){
                System.out.println(-1);
            }
        }
        else{
            int maximum = Integer.MIN_VALUE;
            int indextotake = 0;
            for(int i = 0;i< t.length;i++){
                if(t[i]>= v){
                    indextotake = i;
                    break;
                }
            }
            for(int i = indextotake;i<t.length;i++){
                maximum = Math.max(maximum,p[i]);

            }
            System.out.println(maximum);
        }
    }
}
