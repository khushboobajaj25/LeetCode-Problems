package LeetcodeProblems;
import java.util.*;
public class LastStoneWeight {
}
class Solution1046 {
    public int lastStoneWeight(int[] a) {
        int n = a.length;
        if(n==1){
            return a[0];
        }
        int count=0;
        int index =-1;
        int i=0;
        while(i<n){
            Arrays.sort(a);
            if(a[n-2]==0){
                return a[n-1];
            }
            if(a[n-1]==a[n-2]){
                a[n-1]=0;
                a[n-2]=0;

            }
            else{
                a[n-2] = a[n-1]-a[n-2];

                a[n-1] = 0;
            }
            i++;

        }
        return 0;

    }
}