package LeetcodeProblems;
import java.util.*;
public class Combinations {
}
class Solution77 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {

        int a[] = new int[k];
        find(n,k,1,a,0);
        return result;
    }
    public void find(int n,int k,int num,int a[],int m){
        if(m==k){
            List<Integer> r = new ArrayList<>();
            for(int i =0;i<m;i++){
                r.add(a[i]);
            }
            result.add(r);
            return;
        }
        for(int i =num;i<=n;i++){
            a[m]=i;
            find(n,k,i+1,a,m+1);
        }

    }
}