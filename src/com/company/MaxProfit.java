package com.company;

/**
 * Created by Ashutosh.Purohit on 6/27/17.
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {

        int maxprofit =0;
        int minprice = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0; i< prices.length;i++){

            minprice = Math.min(minprice,prices[i]);
            profit = prices[i] - minprice;
            maxprofit = Math.max(maxprofit,profit);
        }
        return maxprofit;

    }
}
