package LeetcodeProblems;
import java.util.*;
public class NQueens {
}
class Solution51 {
    List<List<String>>res= new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        boolean queen[][] = new boolean[n][n];
        int row = n;
        int col = n;


        queen_validity(0,0,n,queen);

        return res;

    }

    public void convert(boolean queen[][],int n){
        List<String> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            char[] temp=new char[n];
            for(int j=0;j<n;j++){
                if(queen[i][j]){
                    temp[j]='Q';
                }else{
                    temp[j]='.';
                }
            }
            a.add(new String(temp));
        }
        res.add(a);
    }
    public void queen_validity(int i,int j,int n,boolean queen[][]){
        if(i==n){
            return;
        }

        for(int k=0;k<n;k++){
            boolean flag = validity(queen,i,k);
            if(flag){
                queen[i][k]=true;
                queen_validity(i+1,j,n,queen);
                if(i==n-1)
                    convert(queen,n);
                queen[i][k]=false;
            }


        }
    }
    private boolean validity(boolean[][] board,int row,int col){
        int n=board.length;
        for(int i=0;i<n;i++){
            if(board[i][col]){
                return false;
            }
        }
        for(int i=row,j=col;i<n && j<n;i++,j++){
            if(board[i][j])
                return false;
        }
        for(int i=row,j=col;i>=0 && j<n;i--,j++){
            if(board[i][j])
                return false;
        }
        for(int i=row,j=col;i<n && j>=0;i++,j--){
            if(board[i][j])
                return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j])
                return false;
        }

        return true;
    }
}

