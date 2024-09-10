class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length <3){
            return false;
        }else{
            int n=nums.length;
            int min=nums[0];
            int max=nums[0];
                
            // track best sequence length  
            // (not current sequence length) 
            int seq = 1;         
                
            // min number in array 
            int min_num = nums[0];   
                
            // least max number in best sequence  
            // i.e. track arr[j] (e.g. in  
            // array {1, 5, 3} our best sequence  
            // would be {1, 3} with arr[j] = 3) 
            int max_seq = Integer.MIN_VALUE; 
            System.out.println("max seq is "+ max_seq);      
                
            // save arr[i] 
            int store_min = min_num;    
                
            // Iterate from 1 to nums.size() 
            for (int i = 1; i < nums.length; i++)  
            { 
                if (nums[i] == min_num) 
                continue; 
                
                else if (nums[i] < min_num)  
                { 
                min_num = nums[i]; 
                continue; 
                }  
                
                // this condition is only hit  
                // when current sequence size is 2 
                else if (nums[i] < max_seq) {     
                    System.out.println("kook"+nums[i]);
                // update best sequence max number  
                // to a smaller value  
                // (i.e. we've found a  
                // smaller value for arr[j]) 
                max_seq = nums[i];        
                    
                // store best sequence start value  
                // i.e. arr[i] 
                store_min = min_num;             
                }  
                
                // Increase best sequence length &  
                // save next number in our triplet 
                else if (nums[i] > max_seq)  
                {     
                seq++; 
                    
                // We've found our arr[k]! 
                // Print the output 
                if (seq == 3)  
                {             
                    System.out.println("Triplet: " + store_min + ", " + max_seq + ", " + nums[i]); 
                    return true; 
                } 
                max_seq = nums[i]; 
                } 
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