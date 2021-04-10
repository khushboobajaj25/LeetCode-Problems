package LeetcodeProblems;
import java.util.*;
public class SortTheMatrixDiagonally {
    public static void main(String[] args) {
        int[][] res = new Solution1329().diagonalSort(new int[][]{
                {3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}
        });
        for (int[] i : res) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
class Solution1329 {
    int mat2[][] ;
    public int[][] diagonalSort(int[][] mat) {
        int row= mat.length;
        int col = mat[0].length;
        mat2 = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]!=0){
                    change(i,j,mat,row,col);
                }
            }
        }
        return mat2;

    }
    public void change(int i,int j,int mat[][],int row,int col){
        int a[] = new int [101];
        int s=0;
        for(int k=i,l=j;(k<row&&l<col);k++,l++){
            a[s++] =mat[k][l];
            mat[k][l] =0;
        }
        Arrays.sort(a);
        for(int k=i,l=j,m=101-s;(k<row&&l<col);k++,l++,m++){
            mat2[k][l] = a[m];

        }


    }


}
/*class Solution1329 {//using list
    int mat2[][] ;
    public int[][] diagonalSort(int[][] mat) {
        int row= mat.length;
        int col = mat[0].length;
        mat2 = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]!=0){
                    change(i,j,mat,row,col);
                }
            }
        }
        return mat2;

    }
    public void change(int i,int j,int mat[][],int row,int col){
        List<Integer> a = new ArrayList<>();
        int s=0;
        for(int k=i,l=j;(k<row&&l<col);k++,l++){
            a.add(mat[k][l]);
            mat[k][l] =0;
        }
        Collections.sort(a);
        for(int k=i,l=j;(k<row&&l<col);k++,l++){
            mat2[k][l] = a.get(s);
            s++;
        }


    }


}*/

/*class Solution {//using recursion
    int mat2[][] ;
    public int[][] diagonalSort(int[][] mat) {
        int row= mat.length;
        int col = mat[0].length;
        mat2 = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]!=0){
                    int x = i;
                    int y = j;
                    int a[] = new int [101];
                    int s=0;
                    change(i,j,mat,row,col,a,s,x,y);
                }
            }
        }
        return mat2;

    }
    public void change(int i,int j,int mat[][],int row,int col,int a[],int s,int x,int y){

        if(i==row||j==col){
            Arrays.sort(a);
            for(int k=x,l=y,m=101-s;(k<row&&l<col);k++,l++,m++){
                mat2[k][l] = a[m];

            }
            return;
        }

        if(i<row && j<col)
        {
            a[s] =mat[i][j];
            mat[i][j] = 0;
        }
        change(i+1,j+1,mat,row,col,a,s+1,x,y);



    }


}*/
