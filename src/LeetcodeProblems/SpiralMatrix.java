package LeetcodeProblems;
import java.util.*;
public class SpiralMatrix {
}
class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> a=new ArrayList<>();
        int row=matrix.length;
        if(row==0){
            return a;
        }

        int col=matrix[0].length;
        int count=1;
        int r = row-1,c =col-1,t=0;
        while(true){
            if(a.size()==row*col){
                break;
            }
            for(int i=t;i<=c;i++){
                if(a.size()==row*col){
                    break;
                }
                a.add(matrix[t][i]);
            }
            for(int i = t+1;i<r;i++){
                if(a.size()==row*col){
                    break;
                }
                a.add(matrix[i][c]);
            }
            for(int i=c;i>t;i--){
                if(a.size()==row*col){
                    break;
                }
                a.add(matrix[r][i]);
            }
            for(int i =r;i>t;i--){
                if(a.size()==row*col){
                    break;
                }
                a.add(matrix[i][t]);
            }
            if(a.size()==row*col){
                break;
            }
            t++;
            r--;
            c--;
        }
        return a;
    }
}