class Solution {
    public int minFlips(int a, int b, int c) {
        int count=0;
        String str_a=Integer.toBinaryString(a);
        //System.out.println("str_a is " + str_a);
        String str_b=Integer.toBinaryString(b);
        //System.out.println("str_b is " + str_b);
        String str_c=Integer.toBinaryString(c);
        //System.out.println("str_c is " + str_c);
        int max_length=Math.max(Math.max(str_a.length(),str_b.length()),str_c.length());
        //System.out.println("max length is " + max_length);

        String[] string_a = str_a.split("");
        String[] string_b = str_b.split("");
        String[] string_c = str_c.split("");

        int[] a_arr=new int[max_length];
        int[] b_arr=new int[max_length];
        int[] c_arr=new int[max_length];

        int index=max_length-1;
        for(int i=string_a.length-1; i>=0; i--){
            a_arr[index]=Integer.valueOf(string_a[i]);
            index--;
        }

        index=max_length-1;
        for(int i=string_b.length-1; i>=0; i--){
            b_arr[index]=Integer.valueOf(string_b[i]);
            index--;
        }

        index=max_length-1;
        for(int i=string_c.length-1; i>=0; i--){
            c_arr[index]=Integer.valueOf(string_c[i]);
            index--;
        }

        //System.out.println(Arrays.toString(a_arr));
        //System.out.println(Arrays.toString(b_arr));
        //System.out.println(Arrays.toString(c_arr));

        for (int j=0; j<max_length;j++){
            //cases 
            //0 and 0
            // if you need 0 add 0
            // if you need 1 add 1

            // 1 and 0
            // if you need 1 add 0
            // if you need 0 add 1

            // 1 and 1
            // if you need 1 add 0
            // if you need 0 add 2
            if(a_arr[j]==0 && b_arr[j]==0 && c_arr[j]==1){
                count++;
            }
            if(a_arr[j]==1 && b_arr[j]==0 && c_arr[j]==0){
                count++;
            }
            if(a_arr[j]==0 && b_arr[j]==1 && c_arr[j]==0){
                count++;
            }
            if(a_arr[j]==1 && b_arr[j]==1 && c_arr[j]==0){
                count=count+2;
            }
            
        }

        return count;
        
    }
}