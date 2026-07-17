class Solution {
    public int maxProfit(int[] prices) {
        int minp=prices[0];
        int maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minp)
            {
                minp=prices[i];
            }
            else
            {
                int profit=prices[i]-minp;
                if(maxProfit<profit)
                {
                    maxProfit=profit;
                }
            }
        }
        return maxProfit;
    }
}