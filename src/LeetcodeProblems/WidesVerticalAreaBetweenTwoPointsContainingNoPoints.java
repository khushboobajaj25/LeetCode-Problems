package LeetcodeProblems;
import java.util.*;
public class WidesVerticalAreaBetweenTwoPointsContainingNoPoints {
}
class Solution1637 {//11ms
    public int maxWidthOfVerticalArea(int[][] points) {

        int r = points.length;
        int b[] = new int[r];
        int max = 0;
        for(int i=0;i<r;i++){
            b[i] = points[i][0];
        }
        Arrays.sort(b);
        for(int i=r-1;i>=0;i--){
            if(i-1>=0 && b[i]-b[i-1]>max){
                max = b[i]-b[i-1];
            }

        }
        return max;
    }
}