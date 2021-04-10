package LeetcodeProblems;

public class AverageSalaryExcludingtheMinimumandMaximumSalary {
}
class Solution1496 {
    public double average(int[] salary) {
        int n = salary.length;
        int min = 10000000;
        int max = -1;
        double sum = 0;
        for(int i=0;i<n;i++){
            if(salary[i]<min)
                min = salary[i];
            if(salary[i]>max)
                max = salary[i];
            sum += salary[i];
        }
        sum = sum - min - max;
        return sum/(n-2);
    }
}