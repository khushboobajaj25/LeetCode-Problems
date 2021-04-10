package LeetcodeProblems;
import java.util.*;
public class ReplaceWords {
}
/*class Solution648 {//172ms
    public String replaceWords(List<String> dictionary, String sentence) {
        String words[] = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        int n = dictionary.size();
        int words_len = words.length;
        HashMap<String,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            List<Integer> a = new ArrayList<>();
            map.put(dictionary.get(i),(ArrayList<Integer>)a);
        }
        for(int i=0;i<words_len;i++){
            int len = words[i].length();
            for(int j=0;j<len;j++){
                String substring = words[i].substring(0,j+1);
                if(map.containsKey(substring)){
                    if(map.get(substring)==null){
                        List<Integer> a = new ArrayList<>();
                        a.add(i);
                        map.put(substring,(ArrayList<Integer>)a);
                    }
                    else {
                        List <Integer> b = map.get(substring);
                        b.add(i);
                        map.put(substring,(ArrayList<Integer>)b);
                    }
                    break;
                }

            }

        }
        for(Map.Entry<String,ArrayList<Integer>> en:map.entrySet()){
            List<Integer> a = en.getValue();
            String key = en.getKey();
            int l = a.size();
            for(int i=0;i<l;i++){
                int x = a.get(i);
                words[x]=key;
            }
        }

        for(int i=0;i<words_len;i++){
            result.append(words[i]);
            if(i!=words_len-1)
                result.append(" ");
        }
        return String.valueOf(result);
    }
}*/

/*class Solution648 {//165
    public String replaceWords(List<String> dictionary, String sentence) {
        String words[] = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        int n = dictionary.size();
        int words_len = words.length;
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<n;i++){

            set.add(dictionary.get(i));
        }

        for(int i=0;i<words_len;i++){
            int len = words[i].length();
            for(int j=0;j<len;j++){
                String substring = words[i].substring(0,j+1);
                if(set.contains(substring)){
                    words[i] = substring;
                    break;
                }

            }

        }


        for(int i=0;i<words_len;i++){
            result.append(words[i]);
            if(i!=words_len-1)
                result.append(" ");
        }
        return String.valueOf(result);
    }
}*/
class Solution648 {//14ms
    public String replaceWords(List<String> dictionary, String sentence) {
        String words[] = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        int n = dictionary.size();
        int words_len = words.length;
        int max =0;
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<n;i++){
            int len = dictionary.get(i).length();
            if(len>max){
                max = len;
            }
            set.add(dictionary.get(i));
        }

        for(int i=0;i<words_len;i++){
            int len = words[i].length();
            for(int j=0;j<len;j++){
                if(j==max){
                    break;
                }
                String substring = words[i].substring(0,j+1);
                if(set.contains(substring)){
                    words[i] = substring;
                    break;
                }

            }
            result.append(words[i]);
            if(i!=words_len-1)
                result.append(" ");

        }



        return String.valueOf(result);
    }
}