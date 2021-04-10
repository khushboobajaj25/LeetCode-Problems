package LeetcodeProblems;

public class DesignaStackWithIncrementOperation {
}
class CustomStack {//Solution1381
    int top =-1;
    int stack[] ;
    int max=0;
    public CustomStack(int maxSize) {
        max =  maxSize;
        stack =new int[maxSize];
    }

    public void push(int x) {
        if(top+1!=max)
            stack[++top]=x;
    }

    public int pop() {

        if(top!=-1){
            top--;
        }
        else
            return -1;
        return stack[top+1];
    }

    public void increment(int k, int val) {
        int x=0;
        while(x<k && x<=top){
            stack[x]+=val;
            x++;
        }
    }
}
