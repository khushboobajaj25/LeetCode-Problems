package LeetcodeProblems;
import java.util.*;
public class HIndex {
}
class Solution274 {
    public int hIndex(int[] citations) {
        int n = citations.length;
        if(n==0){
            return 0;
        }

        int max = -1;
        int s =0;
        int k =0;
        int m =0;
        int i =0;
        Arrays.sort(citations);
        for(int j =k;;j++){
            max = 0;
            for( i=m;i<n;i++){
                if(citations[i]>=j){
                    break;
                }
                else{
                    m= i;

                }

            }

            if(n-i>=j)
                s = j;
            else
                break;

        }
        return s;
    }
}