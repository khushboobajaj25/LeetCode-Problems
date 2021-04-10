package LeetcodeProblems;
import java.util.*;
public class CountItemsMatchingaRule {
}
class Solution1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int x =0;
        if(ruleKey.equals("color")){
            x = 1;
        }
        else if(ruleKey.equals("name")){
            x =2;
        }
        int n = items.size();
        int count =0;
        for(int i=0;i<n;i++){
            if(items.get(i).get(x).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}