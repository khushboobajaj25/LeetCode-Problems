package LeetcodeProblems;
import java.util.*;
public class AlphabetBoardPath {
}
class Solution1138 {
    public String alphabetBoardPath(String target) {
        int n = target.length();
        char str[] = target.toCharArray();
        HashMap<Character,int []> map = new HashMap<>();
        char ch ='a';
        for(int i=0;i<6;i++){
            for(int j =0;j<5;j++){
                int a[] = new int[2];
                a[0]=i;
                a[1] =j;
                if(ch<='z'){
                    map.put(ch++,a);
                }
                else{
                    break;
                }

            }

        }


        StringBuilder result = new StringBuilder();
        int a[] = map.get('a');
        int r = a[0];
        int c= a[1];
        int b[] = map.get(str[0]);
        int s = b[0];
        int l = b[1];
        for(int i=r;i<s;i++){
            result.append("D");
        }
        for(int i=0;i<l;i++){
            result.append("R");
        }
        result.append("!");


        for(int i=1;i<str.length;i++){
            int p[] = map.get(str[i]);
            int row = p[0];
            int col = p[1];
            int j =s;
            int k = l;
            if(str[i]=='z'){
                if(col>l){
                    while(k<=5 && k!=col){
                        result.append("R");
                        k++;
                    }
                }
                else{
                    while(k>=0&&k!=col){
                        result.append("L");
                        k--;
                    }
                }
                if(row<s){
                    while(j>=0 &&j!=row){
                        result.append("U");
                        j--;
                    }
                }
                else{
                    while(j<6 && j!=row){
                        result.append("D");
                        j++;
                    }
                }



            }
            else{
                if(row<s){
                    while(j>=0 &&j!=row){
                        result.append("U");
                        j--;
                    }
                }
                else{
                    while(j<6 && j!=row){
                        result.append("D");
                        j++;
                    }
                }
                if(col>l){
                    while(k<=5 && k!=col){
                        result.append("R");
                        k++;
                    }
                }
                else{
                    while(k>=0&&k!=col){
                        result.append("L");
                        k--;
                    }
                }


            }

            result.append("!");
            s = row;
            l = col;

        }
        return String.valueOf(result);
    }

}