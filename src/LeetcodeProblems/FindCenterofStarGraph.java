package LeetcodeProblems;

public class FindCenterofStarGraph {
}
class Solution1791
{
    public int findCenter(int[][] edges) {
        int row  = edges.length;
        int x = edges[0][0];
        int y = edges[0][1];
        boolean flag = true;
        for(int i=1;i<row;i++){
            if(x!=edges[i][0]&& x!=edges[i][1]){
                flag = false;
                break;
            }
        }
        if(!flag){
            return y;
        }
        return x;
    }
}