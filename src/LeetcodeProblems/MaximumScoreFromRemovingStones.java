package LeetcodeProblems;
import java.util.*;
public class MaximumScoreFromRemovingStones {
}
class Solution1753 {//14ms
    public int maximumScore(int x, int b, int c) {
        int min =0,max =0,score =0;
        int count=0;
        int a[] = new int[3];
        int index =0;
        int index1 =0;
        a[0]=x;
        a[1]=b;
        a[2]=c;
        int count1=0;
        int count2 =0;
        while(count<2){
            Arrays.sort(a);
            if(count1==0 &&a[0]==0){
                count++;
                count1++;
            }
            if(count2==0&&a[1]==0){
                count++;
                count2++;
                if(count==2){
                    break;
                }

            }
            if(a[0]!=0){
                a[0]--;
            }
            else{
                a[1]--;
            }
            a[2]--;
            score++;
        }
        return score;

    }
}