package LeetcodeProblems;
import java.util.*;
public class LetterCombinationsofaPhoneNumber {

}
class Solution17 {
    String number[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> r = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.equals("")){
            return r;
        }
        char str[] = digits.toCharArray();
        int n = str.length;
        StringBuilder result = new StringBuilder();
        String t = number[Character.getNumericValue(str[0])];
        char str2[] = t.toCharArray();
        combination(0,n,str,result,str2);
        return r;


    }
    public void combination(int j,int n,char str[],StringBuilder result,char str2[]){
        if( j==n){
            r.add(String.valueOf(result));
        }
        else if(j<n){
            String s = number[Character.getNumericValue(str[j])];
            char str1[] = s.toCharArray();
            int x =0;


            for(int k=0;k<str1.length;k++){


                result.append(str1[k]);

                combination(j+1,n,str,result,str2);
                result.deleteCharAt(result.length()-1);





            }

        }


    }
}

