package LeetcodeProblems;
import java.util.*;
public class SquaresOfSortedArray {
}
class Solution977 {
    public int[] sortedSquares(int[] a) {
        int n=a.length;
        int b[] = new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            int square = a[i]*a[i];
            b[k++] = square;
        }
        Arrays.sort(b);
        return b;
    }
}