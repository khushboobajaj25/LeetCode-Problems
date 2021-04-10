import java.util.*;
public class SplitArrayIntoFibonacciSequence {
}
class Solution842 {
    int r[] = new int[200];
    int k=0;
    public List<Integer> splitIntoFibonacci(String S) {
        char str[] = S.toCharArray();
        int n = str.length;
        boolean ans = fibo(0,str,n,S,k);
        List<Integer> a =new ArrayList<>();
        for(int i=0;i<k;i++){
            a.add(r[i]);
        }

        return a;


    }
    public boolean fibo(int i,char str[],int n,String s,int k){
        if(i==n){
            this.k = k;
            return true;
        }


        if(s.charAt(i)=='0'){
            if(k==0||k==1){
                r[k]=0;
                if(fibo(i+1,str,n,s,k+1))
                    return true;
            }
            else if(r[k-1]+r[k-2]==0){
                r[k]=0;
                if(fibo(i+1,str,n,s,k+1))
                    return true;
            }

        }
        else{

            for(int j=i;j<n;j++){
                boolean flag = false;
                long num = Long.parseLong(s.substring(i,j+1));
                if(num>Integer.MAX_VALUE){
                    return false;
                }
                int number =(int)num;
                if(k==0||k==1){
                    r[k] =number;
                    flag= fibo(j+1,str,n,s,k+1);

                }
                else if(number == r[k-1]+r[k-2]){
                    r[k]=number;
                    flag= fibo(j+1,str,n,s,k+1);


                }
                if(flag)
                    return true;
            }


        }



        return false;


    }
}