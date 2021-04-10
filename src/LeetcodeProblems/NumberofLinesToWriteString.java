package LeetcodeProblems;

public class NumberofLinesToWriteString {
    public static void main(String[]args){

    }

}

    class Solution806 {
        public int[] numberOfLines(int[] widths, String S) {
            int n = widths.length;
            char str[] = S.toCharArray();
            int l = str.length;
            int sum =0;
            int count =1;
            int result[] = new int[2];
            for(int i=0;i<l;i++){
                int s = widths[str[i]-'a'];
                sum +=s;
                if(sum>100){
                    sum-=s;
                    count++;
                    i--;
                    sum =0;
                }
            }

            result[0]=count;
            result[1]=sum;
            return result;
        }
    }

