package LeetcodeProblems;
import java.util.*;
public class SearchSuggestionSystem {
}
class Solution1268 {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> result = new ArrayList();
        int n = searchWord.length();
        char str1[] = searchWord.toCharArray();
        Arrays.sort(products);
        int len = products.length;
        for(int i=0;i<n;i++){
            List<String> a =new ArrayList<>();
            result.add(a);
        }

        for(int i=0;i<len;i++){
            char str[] = products[i].toCharArray();
            int n1 =str.length;
            int k =0;
            int m =0;
            while(m<n1 &&k<n &&str[m]==str1[k]){
                if(result.get(k).size()<3)
                    result.get(m).add(products[i]);
                k++;
                m++;
            }
        }
        return result;
    }
}