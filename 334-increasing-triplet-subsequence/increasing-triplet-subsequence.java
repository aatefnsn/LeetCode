class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length <3){
            return false;
        }else{
            int l= nums.length;
            int[] left= new int[l];
            int[] right= new int[l];
            left[0]= nums[0];
            for(int i=1;i<l;i++){ //Find left min
                left[i]=Math.min(nums[i], left[i-1]);
            }
            right[l-1]= nums[l-1];
            for(int i=l-2;i>=0;i--){ //Find right max
                right[i]=Math.max(nums[i], right[i+1]);
            }
            for(int i=0;i<l;i++){ 
                if(left[i]< nums[i] && nums[i]< right[i]) 
                    return true;
            }
         return false;

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
}