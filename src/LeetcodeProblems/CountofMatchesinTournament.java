package LeetcodeProblems;

public class CountofMatchesinTournament {
}
class Solution1688 {
    public int numberOfMatches(int n) {
        int Teams = n;
        int Matches =0;
        int TeamAdvance = 0;
        int sum =0;

        while( Teams!=1){
            if(Teams%2==0){
                Matches = Teams/2;
                sum+=Matches;
            }
            else{
                Matches =(Teams-1)/2;
                sum+=Matches;
            }
            if(Teams%2==0){
                TeamAdvance = Teams/2;
            }
            else{
                TeamAdvance = (Teams-1)/2+1;
            }
            Teams = TeamAdvance;

        }
        return sum;
    }
}
