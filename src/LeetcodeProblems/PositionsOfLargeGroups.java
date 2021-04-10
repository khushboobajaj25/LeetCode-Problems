package LeetcodeProblems;
import java.util.*;
public class PositionsOfLargeGroups {
}
class Solution830 {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        char str[] =s.toCharArray();
        int n = str.length;
        int start =0;
        int end =0;
        while(end<n){
            while(end<n &&str[start]==str[end]){
                end++;
            }
            if(end-start>=3){
                List<Integer> a = new ArrayList<>();
                a.add(start);
                a.add(end-1);
                result.add(a);
            }
            start = end;
        }
        return result;
    }
}