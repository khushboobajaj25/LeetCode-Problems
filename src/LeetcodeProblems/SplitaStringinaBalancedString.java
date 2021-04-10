package LeetcodeProblems;

public class SplitaStringinaBalancedString {
    public static void main(String[] args) {
        System.out.println(new Solution1221().balancedStringSplit("RLRRLLRLRL"));
    }
}
class Solution1221 {
    public int balancedStringSplit(String s) {
        char str[] = s.toCharArray();
        int n = str.length;
        int count = 0;
        int cl=0;
        int cr=0;
        for(int i =0;i<n;i++){
            if(str[i]=='L'){
                cl++;
            }
            else if(str[i]=='R'){
                cr++;
            }
            if(cl==cr){
                count++;
            }
        }
        return count;
    }
}