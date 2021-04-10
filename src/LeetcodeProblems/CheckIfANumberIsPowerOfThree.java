package LeetcodeProblems;

public class CheckIfANumberIsPowerOfThree {
}
class Solution1780 {
    public boolean checkPowersOfThree(int n) {
        return check(n,0,0);
    }
    public boolean check(int n,int sum,int power){
        if(sum ==n)
            return true;
        if(sum<n){
            for(int i=power;;i++){
                sum+=(int)Math.pow(3,i);
                if(sum>n){
                    return false;
                }
                boolean a =  check(n,sum,i+1);
                if(a){
                    return true;
                }
                else{
                    sum-=Math.pow(3,i);
                }
            }
        }



        return false;
    }
}