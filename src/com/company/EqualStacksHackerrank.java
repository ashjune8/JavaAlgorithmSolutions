package com.company;



import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;


/**
 * Created by Ashutosh.Purohit on 8/18/17.
 */
public class EqualStacksHackerrank {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
        }

        int l1 = IntStream.of(h1).sum();
        int l2 = IntStream.of(h2).sum();
        int l3 = IntStream.of(h3).sum();
        int maximum;

        while( l1 != l2 || l2 != l3 || l3 != l1 ){

            maximum = Math.max(Math.max(l1,l2),Math.max(l2,l3));
            if (l1 == maximum){
                h1 = Arrays.copyOfRange(h1,1,h1.length);
                l1 = IntStream.of(h1).sum();
            }
            if (l2 == maximum){
                h2 = Arrays.copyOfRange(h2,1,h2.length);
                l2 = IntStream.of(h2).sum();
            }
            if (l3 == maximum){
                h3 = Arrays.copyOfRange(h3,1,h3.length);
                l3 = IntStream.of(h3).sum();
            }


        }

        System.out.println(IntStream.of(h3).sum());
    }
}
