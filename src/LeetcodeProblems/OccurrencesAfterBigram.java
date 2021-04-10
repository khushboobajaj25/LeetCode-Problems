package LeetcodeProblems;
import java.util.*;
public class OccurrencesAfterBigram {
}
class Solution1078 {
    public String[] findOcurrences(String text, String first, String second) {
        String words[] = text.split(" ");
        List<String> a =new ArrayList<>();
        int len = words.length;
        for(int i=0;i<len;i++){
            if(i+1<len && words[i].equals(first)&& words[i+1].equals(second)){

                if(i+2<len){
                    a.add(words[i+2]);
                }

            }
        }
        int size = a.size();
        String result[] = new String[size];
        for(int i=0;i<size;i++){
            result[i] = a.get(i);
        }
        return result;
    }
}