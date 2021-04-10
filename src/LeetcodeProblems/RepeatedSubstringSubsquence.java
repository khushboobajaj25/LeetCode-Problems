package LeetcodeProblems;

public class RepeatedSubstringSubsquence {
}
class Solution459 {
    public boolean repeatedSubstringPattern(String s) {
        char str[] = s.toCharArray();
        int n = str.length;
        int k =0;

        for(int i=0;i<n/2;i++){
            boolean flag = true;

            String r = s.substring(k,i+1);

            int n1 = r.length();
            for(int j=i+1;j<n;j+=n1){
                if(j+n1>n){
                    flag = false;
                    break;
                }
                String m = s.substring(j,j+n1);


                if(!(r.equals(m))){
                    flag = false;
                    break;
                }

            }
            if(flag){
                return true;
            }
        }
        return false;
    }
}