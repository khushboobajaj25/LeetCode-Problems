package LeetcodeProblems;



class MinStack {//3ms

    /** initialize your data structure here. */
    int StackArray[]=new int [20000];
    int first=-1;
    int min = Integer.MAX_VALUE;




    public void push(int x) {
        first++;
        StackArray[first]=x;
        if(x<min){
            min = x;
        }
    }

    public void pop() {
        int i = top();
        first--;
        if(i==min){
            min = Integer.MAX_VALUE;
            for(int j=0;j<=first;j++){
                if(StackArray[j]<min){
                    min = StackArray[j];
                }
            }
        }


    }

    public int top() {

        return StackArray[first];
    }



    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */