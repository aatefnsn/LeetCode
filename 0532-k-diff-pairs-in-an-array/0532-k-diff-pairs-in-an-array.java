class Solution {
    public int findPairs(int[] nums, int k) {
        //int[] nums_sorted= new int[nums.length];
        Arrays.sort(nums);
        int occ=0;
        for(int i=0; i< nums.length; i++){
            int needed=nums[i]+k;
            if (i>=1 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1; j< nums.length; j++){
                if(nums[j]==needed){
                    occ++;
                    break;
                }
            }
        }

        return occ;
    }
}