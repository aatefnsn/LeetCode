class Solution {
    public int maxArea(int[] height) {
         //System.out.println("height array length is " + height.length);
        int maxArea=0;
        int maxHeight=0;
        for (int i=0; i < height.length -1 ; i++){
            int currentHeight= height[i];
            if (currentHeight<=maxHeight){
                continue;
            }
            else{
                maxHeight=currentHeight;
                //System.out.println("Max Height is " + maxHeight);
            }
            //System.out.println("i is" + i);
            for (int j=i+1; j< height.length; j++){
                //System.out.println("j is" + j);
                int Area= (j-i) * (Math.min(height[i], height[j])); 
                if (Area > maxArea){
                    maxArea = Area;
                }
            }
        }
        return maxArea; 

    }
}