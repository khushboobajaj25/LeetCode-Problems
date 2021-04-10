package LeetcodeProblems;

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(new Solution278().firstBadVersion(5));
    }
}

class VersionControl{// this class is return in leetcode
    protected boolean isBadVersion(int v){
        return true;
    }
}

class Solution278 extends VersionControl {// 12 ms and 2 incorrect submissions

    public int firstBadVersion(int n) {
        int low = 1, high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid))
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }
}