package LeetcodeProblems;
import java.util.*;
public class ToeplitzMatrix {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Solution766 s = new Solution766();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]a=new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                a[i][j]=sc.nextInt();
        System.out.println(s.isToeplitzMatrix(a));
    }
}
class Solution766 {
    public boolean isToeplitzMatrix(int[][] a) {
        int row=a.length;
        int col=a[0].length;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(!(map.containsKey(i-j))){
                    map.put(i-j,a[i][j]);
                }
                else{
                    if(map.get(i-j)!=a[i][j]){
                        return false;
                    }
                }
            }
        }
        return true;

    }

}