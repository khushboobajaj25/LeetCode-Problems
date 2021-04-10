package LeetcodeProblems;
import java.util.*;
public class CarFleet {
}
class Solution853 {
    public int carFleet(int target, int[] position, int[] speed) {
        int p = position.length;
        int s = speed.length;
        if(p==0){
            return 0;
        }
        int b[][] = new int[p][2];
        for(int i=0;i<p;i++){
            b[i][0] = position[i];
            b[i][1] = speed[i];
        }
        Arrays.sort(b,(o1,o2)->o1[0]-o2[0]);
        int time =0;
        int k =0;
        double t[] = new double[p];
        for(int i=0;i<p;i++){
            t[k++]= (1.0)*(target-b[i][0])/b[i][1];

        }
        int count =1;
        for(int i =k-1;i>0;i--){
            if(t[i]>=t[i-1]){
                t[i-1]=t[i];
            }
            else{
                count++;
            }
        }
        return count;
    }
}