package LeetcodeProblems;
import java.util.*;
public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(new Solution49().groupAnagrams(new String[]{
                "eat","tea","tan","ate","nat","bat"
        }));
    }
}
class Solution49 {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> groupAnagrams(String[] strs) {
        int n =strs.length;
        List<List<String>> result = new ArrayList<>();
        HashMap<String,ArrayList<String>> r = new HashMap<>();
        for(int i=0;i<n;i++){
            char str[] = strs[i].toCharArray();
            Arrays.sort(str);
            String s = String.valueOf(str);
            if(r.get(s)==null){
                r.put(s,new ArrayList<String>());

            }
            r.get(s).add(strs[i]);
        }

        for(Map.Entry<String,ArrayList<String>> entry : r.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}