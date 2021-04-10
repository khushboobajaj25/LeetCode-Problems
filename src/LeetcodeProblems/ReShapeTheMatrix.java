package LeetcodeProblems;

public class ReShapeTheMatrix {
}
class Solution566 {
    public int[][] matrixReshape(int[][]a, int r, int c) {

        int row = a.length;
        int col = a[0].length;
        if(row*col!=r*c){
            return a;
        }
        int b[][] = new int[r][c];
        int arr[] = new int[row*col];
        int k=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[k++]=a[i][j];
            }
        }
        int m =0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=arr[m];
                if(m<k)
                    m++;

            }
        }
        return b;
    }
}