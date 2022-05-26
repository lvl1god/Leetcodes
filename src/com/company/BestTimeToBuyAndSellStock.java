package com.company;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int lprice = prices[0];
        int sprice = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < lprice){
               lprice = prices[i];
            }else if(prices[i] - lprice > sprice){
                sprice = prices[i] - lprice;
            }
        }
        return sprice;
    }
    public static void main(String[] args) {
        int[] price = {2,4,1};
        System.out.println(maxProfit(price));
    }
}
