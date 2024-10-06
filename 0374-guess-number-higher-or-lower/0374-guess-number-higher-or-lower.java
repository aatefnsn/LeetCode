/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if (n == 1){
            return 1;
        }
        Random rand = new Random();
        int rand_int1 = rand.nextInt(n-1)+1;// 
        //int rand_int1 = (n) /2;
        System.out.println("rand_int1 is " + rand_int1);
        //int res=guess(rand_int1);
        boolean found= false;
        int start=1;
        int end=n;
        while(!found){
            int res=guess(rand_int1);
            if (res == 0){
                found=true;
                return rand_int1;
            }else if (res == 1){
                //System.out.println("you guessed a lower number, incrementing " + rand_int1);
                //rand_int1++;
                // rand is between start and n
                //Returns a random number between 0 (inclusive) and n (exclusive).
                start=rand_int1 + 1;
                rand_int1=rand.nextInt(end-start+1)+start;
            }else if (res == -1){
                //System.out.println("you guessed a Higher number, decrementing " + rand_int1);
                //rand_int1--;
                //rand is between start and end (rand_int1-1)
                end=rand_int1 - 1;
                rand_int1=rand.nextInt(end-start+1)+start;
            }
        }
        return rand_int1;
    }
}