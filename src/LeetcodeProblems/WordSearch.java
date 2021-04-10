package LeetcodeProblems;

public class WordSearch {

}
class Solution79 {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        char str[] = word.toCharArray();
        int n = str.length;
        boolean a[] = new boolean[n];
        boolean ans = false;
        int k=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j] == str[0]){
                    ans = check(i,j,n,board,0,row,col,str);
                    if(ans){
                        return ans;
                    }
                }
            }
        }

        return ans;

    }
    public boolean check(int i,int j,int n,char[][]board,int l,int row,int col,char str[]){
        boolean a1 = false,a2 = false,a3=false,a4 = false;

        if(l==n){
            return true;
        }
        if(i<0 || j<0 || i==row || j==col ){

            return false;
        }

        else if(board[i][j]==str[l]){
            char temp = board[i][j];
            board[i][j]='?';
            a1 =  check(i,j-1,n,board,l+1,row,col,str);
            if(!a1){
                a2 =  check(i,j+1,n,board,l+1,row,col,str);
            }
            if(!a1 && !a2)
                a3 =  check(i-1,j,n,board,l+1,row,col,str);
            if(!a1&&!a2&&!a3)

                a4 =  check(i+1,j,n,board,l+1,row,col,str);
            board[i][j] = temp;
            return a1||a2||a3||a4;
        }
        else{
            return false;
        }

    }
}
