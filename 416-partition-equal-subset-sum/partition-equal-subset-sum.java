import java.util.Arrays;
import java.util.stream.*;
class Solution {
     Boolean mem[][];
    public boolean canPartition(int[] nums) {

         int sum=0;
        for (int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        //System.out.println("sum is " + sum);
        if(sum % 2 !=0){
            //System.out.println("odd sum");
            return false;
        }else{
            int target=sum/2;
            //System.out.println("target is " + target);
            Set<Integer> sums = new HashSet<>();
            sums.add(0);
            for(int i=0; i< nums.length; i++){
                Object[] arr = sums.toArray();
                for(int j=0;j<arr.length;j++){
                    //System.out.println("adding " + ((int)arr[j]+nums[i]));
                    sums.add((int)arr[j]+nums[i]);
                    if((int)arr[j]+nums[i]==target){
                        return true;
                    }
                }
            }
        }
        return false;

        /// works fine but complex DP
/*
          int sum = 0;
        int n = nums.length;
        
        for(int i : nums) sum+=i;
        
        if(sum%2!=0) return false;
        
        sum /= 2;
        
        mem = new Boolean[n+1][sum+1];
        
        return subsetSum(nums,0,sum);*/
        /////////////////////////////////////////
        /*
        int sum=0;
        for (int j=0; j<nums.length; j++){
            sum=sum+nums[j];
        }
        
        int target=sum/2;
        System.out.println(target);

        int n= nums.length;
        System.out.println("n is " + n);
        int m= target;
        System.out.println("m is " + m);
        int [][] dp = new int [nums.length + 1][target+1];

        int [] new_nums= new int[nums.length+1];
        int f=0;
        for (int k=1; k<=nums.length; k++){
            new_nums[k]=nums[f];
            f++;
        }
        nums=new_nums;

        for (int o=0; o<new_nums.length; o++){
            System.out.print(new_nums[o] + ", ");
        }
        System.out.println();

        for (int i=0; i<=n; i++){
            for(int w=0; w<= target; w++){
                if (i==0|| w==0){
                    dp[i][w]=0;
                }else if(new_nums[i] <= w){
                    dp[i][w]= Math.max(dp[i-1][w - new_nums[i]], dp[i-1][w]);
                    System.out.println(dp[i][w]);
                    if (dp[i][w] == target){
                        System.out.println("target is found");
                        return true;
                    }
                }else{
                    dp[i][w]=dp[i-1][w];
                }
            }
        }

        boolean dp2[][] = new boolean[n+1][sum+1];
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0 || j==0)
                    dp2[i][j] = false;
                else if(nums[i-1] > j)
                    dp2[i][j] = dp2[i-1][j];
                else if(nums[i-1]==j) 
                    dp2[i][j] = true;
                else
                    dp2[i][j] = dp2[i-1][j] || dp2[i-1][j-nums[i-1]];
            }
        }
        return dp2[n][sum];
        */




        //return false;
        /*
        //System.out.println(nums);
        //int[] sorted = new int[nums.length];
        int sum = IntStream.of(nums).sum();
        Arrays.sort(nums);
        //System.out.println(nums[nums.length-1]);
        //System.out.println("sum is "+sum);
        if ((sum)%2 !=0){
            //System.out.println("a7o");
            return false;
        } else if (nums[nums.length-1] > (sum/2)){
            //System.out.println("a3o");
            return false;
        } else if ((sum)%2 ==0){
            //System.out.println("gowa else");
            int sum_left=nums[nums.length-1];
            int sum_right=0;
            System.out.println("Half the sum is " + sum/2);
            //System.out.println("hoppa");
            for (int i=nums.length-2; i >= 0; i--){
                //System.out.println("Sum left is " + sum_left + " and sum is right is "+ sum_right);
                //System.out.println(sum_left + nums[i]);
                if (sum_left + nums[i] > sum/2 ){
                    sum_right=sum_right + nums[i];
                }else if (sum_left + nums[i] <= sum/2){
                    sum_left=sum_left+nums[i];
                }
                else if (sum_right + nums[i] > sum/2 ){
                    sum_left=sum_left+nums[i];
                }
                else if (sum_right + nums[i] <= sum/2 ){
                    sum_right=sum_right+nums[i];
                }
                if(sum_left != sum_right && i == 0){
                    return false;
                }
            }
        }
        /*if (sum - nums[nums.length-1] > nums[nums.length-1] ){
            return false;
        }*/
        //return true;
        
    }
      boolean subsetSum(int[] nums, int pos, int sum){
        if(sum==0) return true;
        
        else if(pos>=nums.length || sum<0) return false;
        
        if(mem[pos][sum]!=null) return mem[pos][sum];
        
        return mem[pos][sum] = subsetSum(nums,pos+1,sum-nums[pos]) ||
                                subsetSum(nums,pos+1,sum);
        
        
    }

}