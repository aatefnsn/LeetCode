class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int f = Integer.MAX_VALUE, s = Integer.MAX_VALUE;
        for (int nValue : nums) {
            //System.out.println("value is " + nValue + ", s is "+ s + ",f is "+ f);
            if (nValue <= f) {
                //System.out.println("first if, value is " + nValue + " and f (before) is " + f);
                f = nValue;
                //System.out.println("first if, value is " + nValue + " and f (after) is " + f);
            }else if (nValue <= s) {
                //System.out.println("second if, value is " + nValue + " and s (before) is " + s);
                s = nValue;
                //System.out.println("second if, value is " + nValue + " and f is " + f);
                //System.out.println("second if, value is " + nValue + " and s (after) is " + s);
            }else if (nValue > s) {
                //System.out.println("found third, value is " + nValue);
                return true;
            }
        }
        return false;
////////////////////////
        // time limit exceeded
        /*if (nums.length <3){
            return false;
        }else{
            for (int i=0; i<nums.length; i++){
                Boolean has_second=false;
                int first=nums[i];
                int second_index=i;
                int second=Integer.MAX_VALUE;
                //System.out.println("first is " + first);
                for(int j=i+1; j<nums.length;j++){
                    if (nums[j] > first && has_second == false){
                        second=nums[j];
                        //System.out.println("second is " + second);
                        has_second=true;
                        second_index=j;
                        //System.out.println("second index is " + second_index);                 
                    }
                    if(nums[j] > second && has_second == true){
                        //System.out.println("third is "+ nums[j]);
                        return true;
                    }
                    if(j==nums.length-1 && has_second==true){
                        //System.out.println("reached dead end and could not find third, need to find next second");
                        j=second_index;
                        has_second=false;
                    }
                    
                }
            }
           return false;*/
/////////////////////////////////////////////////////////////
            // not working solution
            /*
            int n=nums.length;
            for(int i=0; i<n-1; i++){
                if(nums[i+1]>nums[i]){
                    for(int j=i+1;j<n;j++){
                        if(nums[j]>nums[i+1]){
                            return true;
                        }
                    }
                }
                else{
                    continue;
                }
            }
            return false;*/
////////////////////////////////////////////////////////////////////////////////////////////////
//          time limit exceeded

            /*int n = nums.length;
            for(int i=0;i<n-2;i++){
                int nums1=nums[i];
                for(int j=i+1; j<n-1; j++){
                    if(nums[j]> nums[i]){
                        for(int k = j+1; k<n; k++){
                            if(nums[k]> nums[j]){
                                return true;
                            }
                        }
                    }
                }
            }
            return false;*/
        }
    }
//}