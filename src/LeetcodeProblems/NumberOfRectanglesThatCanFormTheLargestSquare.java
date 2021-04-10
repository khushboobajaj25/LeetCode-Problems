package LeetcodeProblems;

public class NumberOfRectanglesThatCanFormTheLargestSquare {
}
class Solution1725 {
    public int countGoodRectangles(int[][] rectangles) {
        int row = rectangles.length;
        int col = rectangles[0].length;
        int r [] = new int[row];
        int k=0;
        int max = 0;
        for(int i=0;i<row;i++){
            if(rectangles[i][0]<rectangles[i][1]){
                r[k++]=rectangles[i][0];
                if(r[k-1]>max){
                    max = r[k-1];
                }
            }
            else{
                r[k++]=rectangles[i][1];
                if(r[k-1]>max){
                    max = r[k-1];
                }
            }
        }
        int count = 0;
        for(int i=0;i<k;i++){
            if(r[i] == max){
                count++;
            }
        }

        return count;
    }
}
