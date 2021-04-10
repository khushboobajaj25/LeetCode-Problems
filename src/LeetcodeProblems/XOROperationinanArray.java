package LeetcodeProblems;

public class XOROperationinanArray {
}
class Solution1486 {
    public int xorOperation(int n, int start) {
        int sum=0,x=0,i=0;
        while(n!=0){
            x = start+2*i;
            sum = sum^x;
            i++;
            n--;
        }
        return sum;
    }
}