package LeetcodeProblems;
import java.util.*;
public class IntersectionOfTwoArrays {
}
class Solution349 {
    public int[] intersection(int[] a, int[] b) {
        int n1=a.length;
        int n2=b.length;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        HashSet <Integer> r = new HashSet<>();
        if(n1<n2){
            for(int i=0;i<n1;i++){
                if(map.get(a[i])==null){
                    map.put(a[i],1);
                }
                else{

                    map.put(a[i],map.get(a[i])+1);
                }
            }

            for(int i=0;i<n2;i++){
                if(map.containsKey(b[i])){
                    r.add(b[i]);
                }
            }
        }

        else{
            for(int i=0;i<n2;i++){
                if(map.get(b[i])==null){
                    map.put(b[i],1);
                }
                else{

                    map.put(b[i],map.get(b[i])+1);
                }
            }
            for(int i=0;i<n1;i++){
                if(map.containsKey(a[i])){
                    r.add(a[i]);
                }
            }
        }
        List<Integer> m = new ArrayList<>(r);
        int n = m.size();
        int result[] = new int[n];
        for(int i=0;i<n;i++){
            result[i]=m.get(i);
        }

        return result;
    }

}