package LeetcodeProblems;

public class LemonadeChange {
}
class Solution860 {//1ms
    public boolean lemonadeChange(int[] b) {
        int n =b.length;
        boolean flag = true;
        int sum =0;

        int five=0,ten=0;
        for(int i=0;i<n;i++){
            if(b[i]==5){
                five++;
                continue;
            }
            else  if(b[i]==10){
                ten++;
                if(!(five>=1)){
                    return false;

                }
                else{
                    five--;
                }
            }
            else if(b[i]==20){

                if(ten==0){
                    if(!(five>=3)){
                        return false;
                    }
                    else{
                        five-=3;
                    }

                }
                else if(!(five>=1)){
                    return false;
                }
                else{
                    ten--;
                    five--;

                }
            }

        }
        return true;
    }
}