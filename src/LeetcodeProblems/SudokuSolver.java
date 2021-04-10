package LeetcodeProblems;

public class SudokuSolver {
}
class Solution37 {
    boolean  isSodukuFull = false;
    public void solveSudoku(char[][] board) {
        fill(board,0,0);

    }
    public void fill(char[][]board,int i,int j){
        if(i==9){
            isSodukuFull = true;
            return;
        }
        if(j==9){
            i++;

            if(i==9){
                isSodukuFull = true;
                return;
            }
            j=0;

        }



        if(board[i][j]=='.'){
            char number='0';
            for(int n=1;n<=9;n++){
                number++;
                boolean   flag = check(board,i,number,j);
                if(flag){
                    board[i][j]=number;
                    fill(board,i,j+1);
                    if(isSodukuFull){
                        return;
                    }
                    else{
                        board[i][j]='.';
                    }


                }

            }
        }
        else{
            fill(board,i,j+1);
        }


    }
    public boolean check(char[][]board,int row,char number,int col){

        for(int k=0;k<9;k++){

            if(board[row][k]==number){
                return false;
            }


        }
        for(int k=0;k<9;k++){
            if(board[k][col]==number){
                return false;
            }
        }
        if(row<3){
            if(col<3){
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        if(board[i][j]==number){
                            return false;
                        }
                    }
                }
            }
            else if(col<6){
                for(int i=0;i<3;i++){
                    for(int j=3;j<6;j++){
                        if(board[i][j]==number){
                            return false;
                        }
                    }
                }
            }
            else if(col<9){
                for(int i=0;i<3;i++){
                    for(int j=6;j<9;j++){
                        if(board[i][j]==number){
                            return false;
                        }
                    }
                }
            }
        }
        else   if(row<6){
            if(col<3){
                for(int i=3;i<6;i++){
                    for(int j=0;j<3;j++){
                        if(board[i][j]==number){
                            return false;
                        }
                    }
                }
            }
            else  if(col<6){
                for(int i=3;i<6;i++){
                    for(int j=3;j<6;j++){
                        if(board[i][j]==number){
                            return false;
                        }
                    }
                }

            }
            else if(col<9){
                for(int i=3;i<6;i++){
                    for(int j=6;j<9;j++){
                        if(board[i][j]==number){
                            return false;
                        }
                    }
                }
            }
        }

        else   if(row<9){
            if(col<3){
                for(int i=6;i<9;i++){
                    for(int j=0;j<3;j++){
                        if(board[i][j]==number){
                            return false;
                        }
                    }
                }
            }
            else if(col<6){
                for(int i=6;i<9;i++){
                    for(int j=3;j<6;j++){
                        if(board[i][j]==number){
                            return false;
                        }
                    }
                }

            }
            else if(col<9){
                for(int i=6;i<9;i++){
                    for(int j=6;j<9;j++){
                        if(board[i][j]==number){
                            return false;
                        }
                    }
                }
            }
        }

        return true;


    }

}
