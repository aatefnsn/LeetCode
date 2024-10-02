class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int min_index=0;
        int max_index=0;
        int max=Integer.MIN_VALUE;
        int profit=0;
        for(int i=0; i< prices.length-1; i++){
            min=Math.min(prices[i],min);
            if(prices[i+1] < prices[i]){
                max=prices[i];
                profit=profit+max-min;
                min=Integer.MAX_VALUE;
                max=Integer.MIN_VALUE;
            }else if(i == prices.length-2){
                max=prices[prices.length-1];
                profit=profit+max-min;
            }
        }
        return profit;
        
        /*
        int profit=0;
        int maxProfit=0;
        for (int i=1; i < prices.length; i++){
            if (prices[i-1] < prices[i]){
                profit=profit+(prices[i] - prices[i-1]);
            }
        }
        return profit;
        */
    }
}