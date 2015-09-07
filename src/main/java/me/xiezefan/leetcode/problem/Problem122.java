package me.xiezefan.leetcode.problem;

/**
 * Best Time to Buy and Sell Stock II
 * Link:https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 * Created by xiezefan on 15/9/6.
 */
public class Problem122 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;

        int[] profits = new int[prices.length];
        profits[0] = 0;
        for (int i=1; i<prices.length; i++) {
            profits[i] = prices[i] - prices[i-1];
        }

        int buy = 0;
        int sell = 0;
        boolean findSell = false;

        for (int i=1; i<profits.length; i++) {
            if (findSell) {
                if (profits[i] < 0) {
                    sell = i - 1;
                    maxProfit = maxProfit + prices[sell] - prices[buy];
                    findSell = false;
                }
            } else {
                if (profits[i] > 0) {
                    buy = i - 1;
                    findSell = true;
                }

            }
        }

        if (findSell && prices[prices.length - 1] > prices[buy]) {
            maxProfit += prices[prices.length - 1] - prices[buy];
        }


        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(new Problem122().maxProfit(new int[] {1, 2, 3, 4, 5, 4, 3, 2 ,1 ,2 ,3 ,4 ,5, 4, 3, 2, 1}));
    }
}
