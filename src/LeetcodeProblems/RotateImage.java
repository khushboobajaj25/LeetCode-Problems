package LeetcodeProblems;

public class RotateImage {
}
/*class Solution48 {//using extra array(0ms)
    public void rotate(int[][] matrix) {
        int n =matrix.length;
        int b[][] = new int[n][n];
        int row=0,col=0;
        for(int j=0;j<n;j++ ){
            col =0;
            for(int i=n-1;i>=0;i--){
                b[row][col++]=matrix[i][j];
            }
            row++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=b[i][j];
            }
        }
    }
}*/
class Solution48 {//without using array
    public void rotate(int[][] matrix) {
        int n =matrix.length;
        int b[][] = new int[n][n];
        int row=0,col=0;
        for(int i=0;i<n;i++){
            for(int j=i ;j<n;j++){
                int  temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i] = temp;
            }

        }
        for(int i=0;i<n;i++){
            int start =0;
            int end = n-1;
            for(int j=0;j<n;j++){
                if(start>end){
                    break;
                }
                if(start!=end){
                    int  temp = matrix[i][start];
                    matrix[i][start] = matrix[i][end];
                    matrix[i][end] = temp;
                }

                start++;
                end--;
            }
        }
    }
}


