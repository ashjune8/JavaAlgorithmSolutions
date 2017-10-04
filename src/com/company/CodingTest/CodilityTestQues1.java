package com.company.CodingTest;

/**
 * Created by Ashutosh.Purohit on 9/9/17.
 */
public class CodilityTestQues1 {

    public int solution(String S){
        if(S == null)
            return 0;
        int count = 0, max = 0, flag = 0;
        for(char ch: S.toCharArray()){
            if(ch == '?' || ch == '!' || ch == '.'){
                max = Math.max(max, count);
                count = 0;
                flag = 0;
            }
            else if(flag == 0 && ch != ' '){
                count++;
                flag = 1;
            }
            else if(flag == 1 && ch == ' '){
                flag = 0;
            }
        }
        return max > count ? max : count;
    }
}
