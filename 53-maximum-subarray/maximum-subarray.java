class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length ==0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        Boolean all_negative=true;
        for(int i=0; i< nums.length; i++){
            if(nums[i]>0){
                all_negative=false;
            }
        }
        if(all_negative){
            return Arrays.stream(nums).max().getAsInt();
        }else{
            //int max=0;
            int[] max_arr=new int[nums.length];
            for(int i=0; i< nums.length; i++){
                if(i==0){
                    max_arr[i]=Math.max(0,nums[i]);
                }else{
                    max_arr[i]=Math.max(0,nums[i]+max_arr[i-1]);
                }
            }
            return Arrays.stream(max_arr).max().getAsInt();
        }
        
    }

    public int maxSubArray0(int[] nums) {
        int max=0;
        if (nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }

        Boolean all_negative=true;
        //int max_negative=0;
        for (int i=0; i<nums.length;i++){
            if(nums[i]>0){
                all_negative=false;
            }
        }
        if(all_negative){
            //int max_negative=Integer.NEGATIVE_INFINITY;
            return Arrays.stream(nums).max().getAsInt();
        }else{
            int[] max_arr=new int[nums.length];
            for(int i=0; i<nums.length; i++){
                if(i==0){
                    max_arr[i]=Math.max(0,nums[i]);
                    if(max_arr[i]>max){
                        max=max_arr[i];
                    }
                }else{
                    max_arr[i]=Math.max(0,nums[i]+ max_arr[i-1]);
                    if(max_arr[i]>max){
                        max=max_arr[i];
                    }
                }
            }

        Stack<Integer> indexes = new Stack<>();
        for (int i=max_arr.length-1; i>=0; i--){
            if(max_arr[i]==max){
                indexes.add(i);
                for(int j=i-1; j>=0; j--){
                    if(max_arr[j] != 0){
                        indexes.add(j);
                    }else{
                        break;
                    }
                }
            }
        }

        while(!indexes.isEmpty()) {
            System.out.print(indexes.pop()+",");
        }

            return max;

        }
        //return max;
        // divide and conquer method
        /*
        Boolean all_negative = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                all_negative = false;
            }
        }
        if (all_negative) {
            return Arrays.stream(nums).max().getAsInt();
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int q = nums.length / 2;
        int[] left = new int[q];
        int[] right = new int[nums.length - q];
        for (int i = 0; i < q; i++) {
            left[i] = nums[i];
        }
        for (int j = q; j < nums.length; j++) {
            right[j - q] = nums[j];
        }
        int left_max = maxSubArray(left);
        int right_max = maxSubArray(right);
        int cross_left_max = 0;
        int cross_right_max = 0;
        int cross_current_sum_left = 0;
        int cross_current_sum_right = 0;
        for (int a = q - 1; a >= 0; a--) {
            cross_current_sum_left = cross_current_sum_left + nums[a];
            if (cross_current_sum_left > cross_left_max) {
                cross_left_max = cross_current_sum_left;
            }
        }
        for (int b = q; b < nums.length; b++) {
            cross_current_sum_right = cross_current_sum_right + nums[b];
            if (cross_current_sum_right > cross_right_max) {
                cross_right_max = cross_current_sum_right;
            }
        }
        return Math.max(Math.max(left_max, right_max), cross_left_max + cross_right_max);
        */
////////////////////
/*
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        Boolean all_negative = true;
        int[] max = new int[nums.length];
        int max_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                all_negative = false;
            }
            if (i == 0) {
                max[i] = Math.max(0, nums[i]);
                if (max[i] > max_sum) {
                    max_sum = max[i];
                }

            } else {
                max[i] = Math.max(0, nums[i] + max[i - 1]);
                if (max[i] > max_sum) {
                    max_sum = max[i];
                }
            }
        }
        Stack<Integer> indexes = new Stack<>();
        for (int i=max.length-1; i>=0; i--){
            if(max[i]==max_sum){
                indexes.add(i);
                for(int j=i-1; j>=0; j--){
                    if(max[j] != 0){
                        indexes.add(j);
                    }else{
                        break;
                    }
                }
            }
        }

        while(!indexes.isEmpty()) {
            System.out.print(indexes.pop()+",");
        }

        if (all_negative) {
            return Arrays.stream(nums).max().getAsInt();
        } else {
            return max_sum;
        }
        */
//////////////////////////////
        

        /*
         * // Kanade's method
         * 
         * if (nums.length == 0)
         * 
         * {
         * return 0;
         * }
         * if (nums.length == 1) {
         * return nums[0];
         * }
         * Boolean all_negative = true;
         * int[] max = new int[nums.length];
         * int max_sum = 0;
         * for (int i = 0; i < nums.length; i++) {
         * if (nums[i] > 0) {
         * all_negative = false;
         * }
         * if (i == 0) {
         * max[i] = Math.max(0, nums[i]);
         * } else {
         * max[i] = Math.max(0, nums[i] + max[i - 1]);
         * }
         * }
         * if (all_negative) {
         * return Arrays.stream(nums).max().getAsInt();
         * } else {
         * return Arrays.stream(max).max().getAsInt();
         * }
         */
        /// discard this block
        /*
         * for(int j=0;j<max.length; j++){
         * if (max[j]> max_sum){
         * max_sum=max[j];
         * }
         * }
         * return max_sum;
         */
        //////////////////
    }
}