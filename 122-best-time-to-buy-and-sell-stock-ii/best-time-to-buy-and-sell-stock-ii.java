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
                System.out.println("min is "+ min + " max is " + max);
                profit=profit+max-min;
                System.out.println("profit now is " + profit);
                min=Integer.MAX_VALUE;
                max=Integer.MIN_VALUE;
            }else if(i == prices.length-2){
                max=prices[prices.length-1];
                profit=profit+max-min;
            }
            //max=Math.max(prices[i], max);
        }
        return profit;
    }
}