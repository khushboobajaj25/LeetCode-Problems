package LeetcodeProblems;
import java.util.*;
public class RelativeSortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution1122 s = new Solution1122();
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int m = sc.nextInt();
        int[] b =  new int[m];
        for(int i=0;i<m;i++)
            b[i]=sc.nextInt();

        System.out.println(Arrays.toString(s.relativeSortArray(a, b)));
    }
}
class Solution1122 {//0ms
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int count[] = new int[1001];
        int result[] = new int[n1];
        for(int i=0;i<n1;i++){
            count[arr1[i]]++;
        }
        int k=0;
        for(int i=0;i<n2;i++){
            while(count[arr2[i]]!=0){
                result[k++]=arr2[i];
                count[arr2[i]]--;
            }

        }
        for(int i=0;i<1001;i++){
            while(count[i]!=0){
                result[k++] = i;
                count[i]--;
            }
        }
        return result;
    }
}