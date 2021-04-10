package LeetcodeProblems;
import java.util.*;
public class MinimumIndexSumofTwoLists {
}
class Solution592 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map =  new HashMap<String,Integer>();

        int n1 = list1.length;
        int n2 = list2.length;
        for(int i=0;i<n1;i++){
            map.put(list1[i],i);
        }
        int max =-1,x=0;
        List<Integer> r = new ArrayList<>();
        int min =Integer.MAX_VALUE;
        for(int i=0;i<n2;i++){
            if( map.containsKey(list2[i])){
                max = map.get(list2[i])+i;
                x = map.get(list2[i]);
                r.add(max);
                r.add(x);

            }



        }
        int m = Integer.MAX_VALUE;
        int count =0;
        for(int i=0;i<r.size();i+=2){
            if(r.get(i)<m){
                m = r.get(i);
            }
        }
        for(int i=0;i<r.size();i+=2){
            if(r.get(i)==m){
                count++;
            }
        }
        String res[] = new String[count];
        int k=0;
        for(int i=0;i<r.size();i+=2){
            if(r.get(i)==m){
                res[k++]=list1[r.get(i+1)];
            }
        }
        return res;
    }
}