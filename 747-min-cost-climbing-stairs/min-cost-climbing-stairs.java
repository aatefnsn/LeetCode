class Solution {
    int[] dp;
    public int minCostClimbingStairsHelper(int[] cost, int n) {
        if (n == -1 || n == -2){ // meaning the size of the array is 0
            //dp[0]=0; //not necessary it is already 0
            return 0;
        }else if (n == 0 || n == 1){ // meaning the size of the array is 2 
            //return Math.min(cost[0], cost[1]);
            return cost[n];
        }else if (dp[n] !=0){
            return dp[n];
        }
        dp[n]=cost[n]+Math.min(minCostClimbingStairsHelper(cost,n-1),minCostClimbingStairsHelper(cost,n-2));
        return dp[n];
    }

    public int minCostClimbingStairs(int[] cost) {
       int n = cost.length;
	    int[] dp = new int[n];
        for (int i=0; i<n; i++) {
            if (i<2) dp[i] = cost[i];
            else dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }
	    return Math.min(dp[n-1], dp[n-2]);
        
        

        // // recurrsive
        // if(cost.length ==0){
        //     return 0;
        // }
        // else if(cost.length ==1){
        //     //return cost[0];
        //     return 0;
        // }else if(cost.length ==2){
        //     return Math.min(cost[0],cost[1]);
        // }else if(cost.length ==3){
        //     return Math.min(cost[1], cost[0]+cost[2]);
        // }
        // //else if (cost.length ==4){
        // //    return Math.min(Math.min(cost[0]+cost[1],cost[0]+cost[2]),Math.min(cost[1]+cost[2],cost[1]+cost[3]));
        // //}
        // else{
        //     /*
        //     if(cost[0] + cost[1] < Math.min(Math.min(cost[0]+cost[2],cost[1]+cost[2]),cost[1]+cost[3])){
        //         int[] new_cost=new int[cost.length-2];
        //         int j=0;
        //         for(int i=2; i<cost.length; i++){
        //             new_cost[j]=cost[i];
        //             j++;
        //         }
        //         return cost[0]+cost[1]+minCostClimbingStairs(new_cost);
        //     }else if(cost[0] + cost[2] < Math.min(Math.min(cost[0]+cost[1],cost[1]+cost[2]),cost[1]+cost[3])){
        //         int[] new_cost=new int[cost.length-3];
        //         int j=0;
        //         for(int i=3; i<cost.length; i++){
        //             new_cost[j]=cost[i];
        //             j++;
        //         }
        //         return cost[0]+cost[2]+minCostClimbingStairs(new_cost);
        //     }else if(cost[1] + cost[2] < Math.min(Math.min(cost[0]+cost[2],cost[1]+cost[0]),cost[1]+cost[3])){
        //         int[] new_cost=new int[cost.length-3];
        //         int j=0;
        //         for(int i=3; i<cost.length; i++){
        //             new_cost[j]=cost[i];
        //             j++;
        //         }
        //         return cost[1]+cost[2]+minCostClimbingStairs(new_cost);
        //     }else{
        //         int[] new_cost=new int[cost.length-4];
        //         int j=0;
        //         for(int i=4; i<cost.length; i++){
        //             new_cost[j]=cost[i];
        //             j++;
        //         }
        //         return cost[1]+cost[3]+minCostClimbingStairs(new_cost);
        //     }*/
            
            
        //     if(cost[0]< cost[1]){ /// check this if the answer is wrong
        //         int[] new_cost=new int[cost.length-1];
        //         int j=0;
        //         for(int i=1; i<cost.length; i++){
        //             new_cost[j]=cost[i];
        //             j++;
        //         }
        //         return Math.min(cost[0],cost[1])+minCostClimbingStairs(new_cost);
        //     }else{
        //         int[] new_cost=new int[cost.length-2];
        //         int j=0;
        //         for(int i=2; i<cost.length; i++){
        //             new_cost[j]=cost[i];
        //             j++;
        //         }
        //         return Math.min(cost[0],cost[1])+minCostClimbingStairs(new_cost);
        //     }
            
        // }

    }
}