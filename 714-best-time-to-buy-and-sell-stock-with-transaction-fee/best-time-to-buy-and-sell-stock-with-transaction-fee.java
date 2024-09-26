class Solution {
    public int maxProfit(int[] prices, int fee) {
        int buy=-prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            buy=Math.max(buy,profit-prices[i]);
            profit=Math.max(buy+prices[i]-fee,profit);
        }
        return profit;
        // recursion Memory Limit exceed passes only 19 Test Cases
        /*
        int max=0;
        int dp[][]=new int[prices.length][prices.length];
        for (int i=0; i<prices.length;i++){ // rows
            for(int j=0; j<prices.length;j++){ // columns
                if(i>=j){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=prices[j]-prices[i]-fee;
                }
            }
        }
        
        int max_day=0;
        for(int j=0;j<prices.length;j++){
            max_day=0;
            for(int i=0;i<prices.length;i++){
                if (dp[i][j]>max_day){
                    max_day=dp[i][j];
                }
            }
            int size = prices.length-j-1;
            int[] prices_new = new int[size];
            int index=0;
            for(int k=j+1;k<prices.length;k++){
                prices_new[index]=prices[k];
                index++;
            }
            int possible_max= max_day+ maxProfit(prices_new,fee);
            if(possible_max > max){
                max=possible_max;
            }
        }
        return max;*/
    }
}