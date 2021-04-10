package LeetcodeProblems;

public class SearchA2DMAtrix {
}
class Solution74{
    public boolean searchMatrix(int[][] m, int target) {
        int row = m.length;
        int col= m[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(m[i][j]>target){
                    return false;
                }
                else if(m[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}