class Solution {
    public int maxProfit(int[] prices, int fee) {
        int [] profit=new int[prices.length];
        int [] effective_buy=new int[prices.length];
        profit[0]=0;
        effective_buy[0]=prices[0];
        for(int i=1; i< prices.length;i++){
            profit[i]=Math.max(profit[i-1],prices[i]-effective_buy[i-1]-fee);
            effective_buy[i]=Math.min(effective_buy[i-1], prices[i]-profit[i-1]);
        }
        return profit[prices.length-1];
        
        // not working solution only passes 19 test cases
        /*
        if(prices.length == 0 || prices.length == 1){
            return 0;
        }else{
            int profit=0;
            int buy=prices[0];
            int final_profit=0;
            for(int i=1; i<prices.length;i++){
                if(prices[i]<buy){
                    buy=prices[i];
                    System.out.println("lower buy prices " + buy);
                    continue;
                }
                if(prices[i] < prices[i-1] && prices[i-1]-prices[i] >= fee){ // drop in price
                    System.out.println("drop in prices from " + prices[i-1] + " to " + prices[i]);
                    System.out.println("buy price is "+ buy + " and sell price is " + prices[i-1]);
                    profit=prices[i-1] - buy -fee;
                    System.out.println("profit is " + profit);
                    if(profit<0){
                        System.out.println("Negative profit, setting to 0");
                        profit=0;
                    }
                    final_profit=final_profit+profit;
                    profit=final_profit;
                    System.out.println("profit is " + profit);
                    buy=prices[i];
                    System.out.println("new buy price is " + buy);
                }
            }
            ///////
            for(int i=0; i<prices.length-1;i++){
                if(prices[i]<buy){
                    buy=prices[i];
                    System.out.println("lower buy prices " + buy);
                }
                if(prices[i+1] < prices[i] && prices[i]-prices[i+1] >= fee){ // drop in price
                    System.out.println("drop in prices from " + prices[i] + " to " + prices[i+1]);
                    System.out.println("buy price is "+ buy);
                    profit=prices[i] - buy -fee;
                    if(profit<0){
                        profit=0;
                    }
                    final_profit=final_profit+profit;
                    profit=final_profit;
                    System.out.println("profit is " + profit);
                    buy=prices[i+1];
                    System.out.println("new buy price is " + buy);
                }
            }
            ////////////
            if(prices[prices.length-1] > buy){
                profit=prices[prices.length-1]-buy-fee;
                
                if(profit<0){
                        profit=0;
                    }
                    final_profit=final_profit+profit;
                    profit=final_profit;
            }
            return profit;
        }*/
        ////// solution from past leetcode solutions but still not optimal
        /*
        int n = prices.length;
        if(n <= 1)
            return 0;
        int profit[] = new int[n + 1];
        for(int i = 1; i <= n; ++i){
            //if(i<n)
            //    System.out.println("i is "+ i + " and current price is "+ prices[i]);
            int prevProfit = 0;  // It stores the max answer from 0 to j - 1. 
            for(int j = 1; j < i; ++j){
                //System.out.println("j is "+j);
                //System.out.println("Prev Profit  is "+ prevProfit);
                prevProfit = Math.max(prevProfit, profit[j - 1]); // profit up until last transaction
                //System.out.println("After, Prev Profit is "+ prevProfit);
                ////////////////// sale price - each possible previous buy price - fee + prev profit
                profit[i] = Math.max(profit[i], prices[i - 1] - prices[j - 1] - fee + prevProfit);
                //System.out.println("profit[i] is "+ profit[i]);
            }
        }
        int ans = 0;
        for(int a : profit)
            ans = Math.max(ans, a);
        return ans;*/
        /////////////////////////////////////////////////////////////////////////////////////
        // iterative solution works fine
        /*
        int buy=-prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            buy=Math.max(buy,profit-prices[i]);// max of buy profit-price or ignore buying buy
            profit=Math.max(buy+prices[i]-fee,profit);//
        }
        return profit;*/
        /////////////////////////////////////////////////////////////////
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