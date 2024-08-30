class Solution {
    public int tribonacci(int n) {
        int[] tri = new int[n+1];
        if(n==0){
            return 0;
        }else if (n == 1){
            return 1;
        }else if (n ==2){
            return 1;
        }else if (n > 2){
            //int[] tri = new[n+1];
            tri[1]=1;
            tri[2]=1;
            for(int i=3;i<=n;i++){
                tri[i]=tri[i-1]+tri[i-2]+tri[i-3];
            }
        }
        return tri[n];
    }
}