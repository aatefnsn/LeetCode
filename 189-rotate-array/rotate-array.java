class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int[] nums_res=new int[nums.length];
        /*for (int i=nums.length-1; i>nums.length-1-k; i--){
            int head=nums[i];
            //System.out.println(head);
        }*/
        if (nums.length >k){
            int index=0;
            for (int i=nums.length-k;i<nums.length; i++){
                //int head=nums[i];
                //System.out.println(head);
                nums_res[index]=nums[i];
                index++;
            }
            for(int j=0;j<nums.length-k;j++){
                nums_res[index]=nums[j];
                index++;
            }
            //System.out.println(Arrays.toString(nums_res));
            
            for(int l=0; l<nums.length; l++){
                nums[l]=nums_res[l];
            }
        }
        //Passes 37 out of 38 tests cases because Big O of N^2
        /*for (int i=0; i<k; i++){
            int head=nums[nums.length-1];    
            for(int j=nums.length-2;j>=0;j--){
                //int temp=nums[j-1];
                nums[j+1]=nums[j];
            }
            nums[0]=head;
        }*/
    }
}