class Solution {
    public int maxProfit(int[] prices) {
        //int profit=0;
        int min=Integer.MAX_VALUE;
        int profit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            min=Math.min(prices[i], min);
            profit=Math.max(profit, prices[i]-min);
        }
        return profit;

        // passed majority of test cases but it is o(n^2) so time limit exceeded for a few test cases
        /*
        int max_profit=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0; i < prices.length-1; i++){
            if(prices[i] < min){
                min=prices[i];
                max=Integer.MIN_VALUE;
            }
            for(int j=i+1; j<prices.length; j++){
                if(prices[j]> max && prices[j]> min){
                    max=prices[j];
                    int profit=max-min;
                    if (profit> max_profit){
                        max_profit=profit;
                    }
                }
            }
        }
        return max_profit;*/

        // working solution o(n) but long and complex .. passes all test cases and beats 99%
        /*
        int min=Integer.MAX_VALUE;
        int min_index=0;
        int max_index=0;
        int max=Integer.MIN_VALUE;
        int max_profit=Integer.MIN_VALUE;
        for (int i=0; i< prices.length; i++){
            if (prices[i] < min && i < prices.length-1){
                //System.out.println("found a new minimum " + prices[i]);
                min=prices[i];
                min_index=i;
                max=Integer.MIN_VALUE;
            }
            if (prices[i] > max && prices[i] > min && i > min_index){
                //System.out.println("found a new maximum " + prices[i]);
                max=prices[i];
                max_index=i;
                int profit=max-min;
                if(profit > max_profit){
                    max_profit=profit;
                }
            }
        }
        if ((min==Integer.MAX_VALUE || max==Integer.MIN_VALUE) && max_profit == Integer.MIN_VALUE){
            return 0;
        }else{
            return max_profit;
        }*/
    }
}