class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res="";
        char[] word1_arr=word1.toCharArray();
        if(word1_arr.length == 0){
            return word2;
        }
        char[] word2_arr=word2.toCharArray();
        if(word2_arr.length == 0){
            return word1;
        }
        int word1_size=word1_arr.length;
        int word2_size=word2_arr.length;
        char[] res_arr = new char[word1_size+word2_size];
        int res_index=0;
        int word1_index=0;
        int word2_index=0;
        while(word1_index < word1_size || word2_index < word2_size  ){
            if(word1_index < word1_size){
            res_arr[res_index]=word1_arr[word1_index];
            res_index++;
            word1_index++;
            }
            if(word2_index < word2_size){
            res_arr[res_index]=word2_arr[word2_index];
            res_index++;
            word2_index++;
            }
        }
        res=String.valueOf(res_arr);
        return res;
    }
}