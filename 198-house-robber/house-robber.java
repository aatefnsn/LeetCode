class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i=0; i< nums.length; i++){
            if (i == 0 || i == 1){
                dp[i]=nums[i];
            }else{
                int max=0;
                for(int j=i-2;j>=0; j--){
                    if(dp[j]>max){
                        max=dp[j];
                    }
                }
                dp[i]=nums[i]+max;
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}