package LeetcodeProblems;

public class MaximumNumberofBallsinaBox {
}
class Solution1342 {
    public int countBalls(int lowLimit, int highLimit) {
        int count[] = new int[50];
        int max =0;
        for(int i = lowLimit;i<=highLimit;i++){
            int n =i;
            int sum=0;
            while(n!=0){
                int   d=n%10;
                sum+=d;
                n=n/10;
            }
            count[sum]++;
        }
        for(int i=0;i<50;i++){
            if(count[i]>max){
                max = count[i];
            }
        }
        return max;
    }
}


