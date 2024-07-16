class Solution {
    public int findPairs(int[] nums, int k) {
        //int[] nums_sorted= new int[nums.length];
        Arrays.sort(nums);
        int occ=0;
        //HashMap <Integer, Integer> hm = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            int needed=nums[i]+k;
            if (i>=1 && nums[i]==nums[i-1]){
                continue;
            }
            System.out.println("needed is " + needed);
            for(int j=i+1; j< nums.length; j++){
                if(nums[j]==needed){
                    System.out.println("Founded the needed, incrementing occ");
                    occ++;
                    break;
                }
            }
            //hm.put(nums[i], nums[i]-k);
        }

        return occ;
    }
}