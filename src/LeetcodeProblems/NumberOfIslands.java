package LeetcodeProblems;

public class NumberOfIslands {
}
class Solution200 {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int x =0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == '1'){
                    x+=islands(i,j,row,col,grid);
                }
            }
        }
        return x;

    }
    public int islands(int i,int j,int m,int n,char grid[][]){
        if(i<0 || j<0 || i==m || j==n||grid[i][j] == '0'){
            return 0;
        }

        else{
            grid[i][j] ='0';
            islands(i+1,j,m,n,grid);
            islands(i-1,j,m,n,grid);
            islands(i,j+1,m,n,grid);
            islands(i, j-1,m,n,grid);
            return 1;

        }
    }
}