class Solution {
    
    
    
    public static void printArray(int arr[][])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(Arrays.toString(arr[i]) + " ");
        System.out.println();
    }
    
    
    public static int [][] sortShips(int[][] ships){
         int n = ships.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (ships[j][0] > ships[j+1][0])
                {
                    // swap arr[j+1] and arr[j]
                    int []temp = ships[j];
                    ships[j] = ships[j+1];
                    ships[j+1] = temp;
                }
        //printArray(ships);
        return ships;
    }
    
    
    public static void sinkOverLappingShips(int currentShip, int[][] ships){
        int highestoverlapping=ships[currentShip][1];
        //int koko=currentShip+1;
        //int kokowawa=ships.length;
        //System.out.println("inside SinkOverlappingShips, i will be " + koko + " and i ends at " +kokowawa );
        for (int i=currentShip+1; i<ships.length;i++){
            //System.out.println("checking");
            if (ships[currentShip][1] >= ships[i][0] && ships[i][0] <= highestoverlapping){
                //highestoverlapping=ships[currentShip][1];
                //System.out.println("Sink that bitch");
                if (ships[i][1]<highestoverlapping){
                    highestoverlapping=ships[i][1];
                }
                ships[i][0]=-1;
                ships[i][1]=-1;
                //System.out.println("Sunk, Goodbye");
            }
            else{
                //System.out.println("no overlap");
            }
        }
    }
    
    public static int findMinArrowShots(int [][] points){
        if (points.length > 100000 || points[0].length != 2){
            return -1;
        }
        int count=0;
        Arrays.sort(points, Comparator.comparingDouble(o -> o[0]));
        int[][]sortedShips=points;
        //int [][] sortedShips = sortShips(points);
        
        for (int i=0; i< sortedShips.length;i++){
            //System.out.println("i is " + i);
            if (sortedShips[i][0] != -1){
                //System.out.println("found unsunken ship");
                sinkOverLappingShips(i, sortedShips);
                //System.out.print("ships array now looks like ");
                //printArray(points);
                count++;
            }
            else{
                //System.out.println("Sunken ship");
            }
        }
        
        return count;
    }
}