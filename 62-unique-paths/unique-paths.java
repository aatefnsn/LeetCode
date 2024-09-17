class Solution {
    public int uniquePaths(int m, int n) {
        // works but gives time limit exceeded need to do it using DP
        /*int count=0;
        for(int i=0;i< Math.pow(2,m+n-2);i++){
            String s= Integer.toBinaryString(i);
            if(Integer.bitCount(i) == n-1){
                count++;
            }
        }
        return count;*/

        //DP
        if(n==0 || m==0){
            return 0;
        }else if(n==1 || m==1){
            return 1;
        }else{
            int count=0;
            int[][]dp=new int[m][n];
            for(int i=0;i<m;i++){
                dp[i][0]=1;
            }
            for(int i=0;i<n;i++){
                dp[0][i]=1;
            }
            for(int j=1;j<m;j++){
                for(int k=1;k<n;k++){
                    dp[j][k]=dp[j-1][k]+dp[j][k-1];
                }
            }
            return dp[m-1][n-1];
        }



        /*if(m==0 && n==0){
            return 0;
        }
        else if(m==1 && n==1){
            return 0;
        }else if(m==1 && n==2){
            return 1;
        }else if(m==2 && n==1){
            return 1;
        }else if(m>=2 && n>=2){
            return 2+uniquePaths(m-1, n-1);
        }else if(m>=2 && n==1){
            return 1+uniquePaths(m-1, n);
        }else if(m==1 && n>=2){
            return 1+uniquePaths(m, n-1);
        }
        return 1;*/
    }
}