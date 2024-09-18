class Solution {
    public int longestCommonSubsequenceHelper(String text1, String text2) {
        int text1_len=text1.length();
        int text2_len=text2.length();
        if (text1.length()==0 || text2.length()==0){
            return 0;
        }else if(text1.charAt(0)==text2.charAt(0)){
            return 1+longestCommonSubsequenceHelper(text1.substring(1,text1_len),text2.substring(1,text2_len));
        }else{
            return Math.max(longestCommonSubsequenceHelper(text1.substring(1,text1_len),text2.substring(0,text2_len)),longestCommonSubsequenceHelper(text1.substring(0,text1_len),text2.substring(1,text2_len)));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 0; i < text1.length(); ++i)
            for (int j = 0; j < text2.length(); ++j)
                if (text1.charAt(i) == text2.charAt(j)) dp[i + 1][j + 1] = 1 + dp[i][j];
                else dp[i + 1][j + 1] =  Math.max(dp[i][j + 1], dp[i + 1][j]);
        return dp[text1.length()][text2.length()];


        /*int count=0;
        int text1_len=text1.length();
        int text2_len=text2.length();
        int [][]dp=new int[text1_len][text2_len]; // text1 is Row and text2 is Column
        for(int i=0;i<text1.length();i++){
            for(int j=0;j<text2.length();j++){
                dp[i][j]=-1;
            }
        }
        if (text1.length()==0 || text2.length()==0){
            return 0;
        }else{
            for(int i=0;i<text1.length()-1;i++){
                for(int j=0;j<text2.length()-1;j++){
                    if(text1.charAt(i)==text2.charAt(j) && dp[i+1][j+1] != -1){
                        System.out.println("char " + text1.charAt(i) + " is same as " + text2.charAt(j));
                        dp[i][j]=1+dp[i+1][j+1];
                        if(dp[i][j]>count){
                            count=dp[i][j];
                        }
                    }
                    else if(text1.charAt(i)==text2.charAt(j) && dp[i+1][j+1] == -1){
                        System.out.println("char " + text1.charAt(i) + " is same as " + text2.charAt(j));
                        dp[i][j]=1+longestCommonSubsequenceHelper(text1.substring(i+1,text1_len),text2.substring(j+1,text2_len));
                        if(dp[i][j]>count){
                            count=dp[i][j];
                        }
                    }else if (text1.charAt(i)!=text2.charAt(j) && dp[i][j] == -1){
                        dp[i][j]=Math.max(longestCommonSubsequenceHelper(text1.substring(i+1,text1_len),text2.substring(j,text2_len)),longestCommonSubsequenceHelper(text1.substring(i,text1_len),text2.substring(j+1,text2_len)));
                        if(dp[i][j]>count){
                            count=dp[i][j];
                        }
                    }
                }
            }
        }        
        return count;*/
        ///////////////////////////////////////////////
        /*int text1_len=text1.length();
        int text2_len=text2.length();
        int [][]dp=new int[text1_len][text2_len]; // text1 is Row and text2 is Column
        for(int i=0;i<text2.length();i++){
            for(int j=0;j<text1.length();j++){
                dp[j][i]=-1;
            }
        }

        if (text1.length()==0 || text2.length()==0){
            return 0;
        }else if(text1.charAt(0)==text2.charAt(0)){
            return 1+longestCommonSubsequence(text1.substring(1,text1_len),text2.substring(1,text2_len));
        }else{
            return Math.max(longestCommonSubsequence(text1.substring(1,text1_len),text2.substring(0,text2_len)),longestCommonSubsequence(text1.substring(0,text1_len),text2.substring(1,text2_len)));
        }*/
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*int count=0;
        int max_count=0;
        if(text1.length()==0 || text2.length()==0){
            return 0;
        }else{
            int text1_len=text1.length();
            int text2_len=text2.length();
            for(int i=0;i<text1.length();i++){
                for(int j=0;j<text2.length();j++){
                    if(text1.charAt(i)==text2.charAt(j)){
                        return 1+longestCommonSubsequence(text1.substring(i+1,text1_len),text2.substring(j+1,text2_len));
                    }else{
                        return Math.max(longestCommonSubsequence(text1.substring(i+1,text1_len),text2.substring(j,text2_len)),longestCommonSubsequence(text1.substring(i,text1_len),text2.substring(j+1,text2_len)));
                    }
                }
            }
            return count;
        } */
    }
}