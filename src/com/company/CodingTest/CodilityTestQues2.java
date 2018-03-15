package com.company.CodingTest;

/**
 * Created by Ashutosh.Purohit on 9/9/17.
 */
public class CodilityTestQues2 {

    public static void main(String[] args) {
        CodilityTestQues2 codilityTestQues2 = new CodilityTestQues2();
        int[] A = {1,2,4,5,7,29,20};
        System.out.println(solution(A));
    }

    public static int solution(int[] A){

        if (A.length >= 23){
            return 25;
        }
        else if (A.length <= 3){
            return 2*A.length;
        }
        int sol = Math.min(finalsol(A,1,A[0]+6)+7,finalsol(A,1,0)+2);
        return Math.min(sol,25);
    }

        public static int finalsol(int[] A, int position, int maximum){

        if(position >= A.length){
            return 0;
        }
        if (A[position] <= maximum){
            return finalsol(A, position+1, maximum);
        }
        else {
            return (Math.min(finalsol(A,position+1,A[position]+6)+7,finalsol(A,position+1,0)+2));
        }
        }
}
