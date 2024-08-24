class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int max=0;
        int start=0;
        int end=nums.length -1;
        while(start < end){
            //System.out.println("Start is " + start+ " and end is " + end);
            if (nums[start]+ nums[end] == k){
                start++;
                end--;
                max++;
            }else if (nums[start]+ nums[end] < k){
                start++;
            }else if (nums[start]+ nums[end] > k){
                end--;
            }
        }
        return max;
    }
}