package LeetcodeProblems;

public class GuessNumberHigherorLower {
}
/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

class Solution374 extends GuessGame {
    public int guessNumber(int n) {
        int low =1;
        int high = n;
        while(low<=high){
            int mid = low+(high-low)/2;
            int x = guess(mid);
            if(x==-1){
                high = mid-1;
            }
            else if(x==1){
                low = mid+1;
            }
            else{
                return mid;
            }
        }
        return 0;
    }

}
class GuessGame{
public int guess(int num){
   return 0;
}
}