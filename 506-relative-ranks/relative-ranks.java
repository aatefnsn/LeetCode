//import java.util.Collections;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];
        int[] rank = new int[score.length];
        int [] sorted=new int[score.length];
        for(int m=0;m<score.length;m++){
            sorted[m]=score[m];
        }
        Arrays.sort(sorted);
        int[] sorted_reverse=new int[score.length];
        int index=sorted.length-1;
        for(int n=0;n<sorted.length;n++){
            sorted_reverse[n]=sorted[index];
            index--;
        }
        sorted=sorted_reverse;

        //System.out.println("Score");
        //System.out.println(Arrays.toString(score));

        //System.out.println("Sorted");
        //System.out.println(Arrays.toString(sorted_reverse));

        for (int j = 0; j < score.length; j++) {
            rank[j] = findPos(sorted, score[j]);
        }
        //System.out.println("Rank");
        //System.out.println(Arrays.toString(rank));
        for (int y=0; y<score.length; y++){
            answer[y]=Integer.toString(rank[y]+1);
        }
        //System.out.println("Rank now");
        //System.out.println(Arrays.toString(answer));
        for (int y=0; y<score.length; y++){
            if (answer[y].equals("1")){
                answer[y]="Gold Medal";
            }if (answer[y].equals("2")){
                answer[y]="Silver Medal";
            }
            if (answer[y].equals("3")){
                answer[y]="Bronze Medal";
            }
        }
        return answer;
    }

    public int findPos(int[] sorted, int score) {
        for (int k = 0; k < sorted.length; k++) {
            if (sorted[k] == score) {
                return k;
            }
        }
        return 0;
    }

}