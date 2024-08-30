class Solution {
    /*
    public static boolean isPowerOfTwo(int n) {
        if (n == 0)
            return false;

        return (int) (Math.ceil((Math.log(n) / Math.log(2)))) == (int) (Math.floor(
                ((Math.log(n) / Math.log(2)))));
    }*/

    public int[] countBits(int n) {
        int[] counts = new int[n + 1];
        if(n ==0){
            return counts;
        }else if (n==1){
            counts[1]=1;
        }else if(n>1){
            int t=0;
            for(int i=2; i <= n; i++){
                counts[1]=1;
                if(((Math.log(i) / Math.log(2))) % 1 == 0 ){ //whole number not a decimal
                    System.out.println(i + " is a power of 2, new range");
                    counts[i]=1;
                    t=i;
                }else{
                    counts[i]=1+counts[i-t];
                }
            }
        }
        return counts;
        /*
        int[] counts = new int[n + 1];
        if (n == 0) {
            return counts;
        } else if (n == 1) {
            counts[1] = 1;
            return counts;
        }else if (n > 1) {
            counts[1] = 1;
            for (int i = 2; i <= n; i++) {
                if (isPowerOfTwo(i) == true) {
                    //System.out.println(i + " is a power of 2");
                    counts[i] = 1;
                } else {
                    //System.out.println(i + " is NOT a power of 2");
                    int j = i;
                    while (isPowerOfTwo(j) == false) {
                        j--;
                    }
                    counts[i] = 1 + counts[i - j];
                }

            }
        }
        return counts;*/
    }
}