package LeetcodeProblems;

public class CheckifOneStringSwapCanMakeStringsEqual {
}
class Solution1790 {//1ms to do again
    public boolean areAlmostEqual(String s1, String s2) {
        char str1[] = s1.toCharArray();
        char str2[] = s2.toCharArray();
        int n1 = str1.length;
        int n2= str2.length;
        char a ='!',b ='?';
        int count = 0;
        for(int i=0;i<n1;i++){
            if(str1[i]!=str2[i]){
                count++;
                if(count==2){
                    if(str1[i]!=b ||str2[i]!=a){
                        return false;
                    }
                }
                else if(count>=3)
                    return false;

                a=str1[i];
                b = str2[i];
            }

        }
        return count==0||count==2;

    }

}