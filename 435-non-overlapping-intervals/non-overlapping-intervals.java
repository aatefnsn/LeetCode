class Solution {

         static void bubbleSort(int arr[][])
    {
        int n = arr.length;
        int i, j;
        int[] temp= new int[2];
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j][0] > arr[j + 1][0]) {
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        int counter=0;
        //bubbleSort(intervals);
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[0]));
        /*
        for(int i=0; i< intervals.length;i++){
            System.out.print(Arrays.toString(intervals[i]));
        }
        System.out.println();
        */
        int prevEnd=intervals[0][1];
        for(int i=1; i< intervals.length;i++){
            //System.out.print(Arrays.toString(intervals[i]));
            if(intervals[i][0]>=prevEnd){
                //System.out.println("No overlap");
                prevEnd=intervals[i][1];
                //counter++;
                //intervals[i][1]=intervals[i-1][1];
            }else{
                //System.out.println("Overlap");
                counter++;
                prevEnd=Math.min(prevEnd,intervals[i][1]);
            }
        }


        return counter;
    }
}