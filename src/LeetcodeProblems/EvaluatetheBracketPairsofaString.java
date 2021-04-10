package LeetcodeProblems;
import java.util.*;
public class EvaluatetheBracketPairsofaString {
    public static void main(String[]args){

    }



}
class Solution1807 {//36ms
    public String evaluate(String s, List<List<String>> knowledge) {
        int n  =s.length();
        char str[] = s.toCharArray();
        StringBuilder result = new StringBuilder();
        HashMap<String,String> map = new HashMap<>();
        for(int i =0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        for(int i=0;i<n;i++){
            if(str[i]=='('){
                StringBuilder r = new StringBuilder();
                i++;
                while(str[i]!=')'){
                    r.append(str[i]);
                    i++;
                }

                if(map.get(String.valueOf(r))!=null){
                    result.append(map.get(String.valueOf(r)));
                }
                else{
                    result.append("?");
                }

            }
            else{
                result.append(str[i]);
            }

        }
        return String.valueOf(result);
    }
}