class Solution {
    public int getGcd(int a, int b) {
        if (b==0) return a;
        return getGcd(b,a%b);
    }
    public String gcdOfStrings(String str1, String str2) {
        String res="";
        if(!(str1+str2).equals(str2+str1)){
            return res;
        }else{
            int gcd = getGcd(str1.length(), str2.length());
            return str1.substring(0, gcd);
            //System.out.println("GCD");
            //return str2;
        }




        /*
        String res="";
        char[] str1_array=str1.toCharArray();
        int n=str1_array.length;
        char[] str2_array=str2.toCharArray();
        int m=str2_array.length;
        int min_length=Math.min(m,n);
        char [] res_array=new char[min_length];
        if(str1_array[0] != str2_array[0]){
            return res;
        }
        for(int i=0;i<min_length;i++){
            if(str1_array[i]==str2_array[i]){
                res_array[i]=str1_array[i];
                res=String.valueOf(res_array);
            }
        }
        if(res_array.length % 2 != 0){
            return res;
        }else{
            int index=res_array.length/2;
            char []res_ = new char[res_array.length/2];
            for(int i=0;i<res_array.length/2;i++){
                if(res_array[i]==res_array[index]){
                    res_[i]=res_array[i];
                    index++;
                }
            }
            return String.valueOf(res_);
        }
     */   
    }
}