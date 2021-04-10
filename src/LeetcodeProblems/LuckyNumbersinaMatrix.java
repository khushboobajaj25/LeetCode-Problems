package LeetcodeProblems;
import java.util.*;
public class LuckyNumbersinaMatrix {
}
/*class Solution1380 {//17ms
    public List<Integer> luckyNumbers (int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int max=0,min =0;
        int r=-1,c=-1;
        min = matrix[0][0];
        int minr[] = new int[row*col];
        int maxc[] = new int[row*col];
        int k=0,j=0;
        while(k<row){
            r++;
            min = 100000;
            for(int i=0;i<col;i++){
                if(matrix[r][i]<min){
                    min = matrix[r][i];
                }


            }
            minr[k++]=min;
        }

        while(j<col){
            c++;
            max =0;
            for(int i=0;i<row;i++){
                if(matrix[i][c]>max){
                    max = matrix[i][c];
                }



            }
            maxc[j++] = max;
        }
        int sum = k+j;
        int result[] = new int[sum];
        int x =0;

        for(int s =0;s<k;s++){
            result[x++]=minr[s];
        }
        for(int i=0;i<j;i++){
            result[x++]=maxc[i];
        }
        int count[] = new int[100000];
        List<Integer> results = new ArrayList<>();
        for(int i=0;i<x;i++){

            count[result[i]]++;


        }
        for(int i=0;i<100000;i++){
            if(count[i]>1){
                results.add(i);
            }
        }
        return results;

    }
}*/
class Solution1380 {//2ms
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int max=0,min =0;
        HashMap<Integer,Boolean> res = new HashMap<>();
        for(int i=0;i<row;i++){
            min = matrix[i][0];
            for(int j=1;j<col;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
            }
            res.put(min,true);
        }
        for(int i=0;i<col;i++){
            max = matrix[0][i];
            for(int j=1;j<row;j++){
                if(matrix[j][i]>max){
                    max = matrix[j][i];
                }
            }
            if(res.get(max)!=null){
                result.add(max);
            }

        }
        return result;
    }
}
