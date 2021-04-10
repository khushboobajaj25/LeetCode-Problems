package LeetcodeProblems;

public class MaximumUnitsonaTruck {
}
class Solution1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int row = boxTypes.length;
        int col = boxTypes[0].length;
        int r =0;
        int temp;
        for(int i=0;i<row;i++){
            for(int j=0;j<row-1-i;j++){
                if(boxTypes[j][1]>boxTypes[j+1][1]){
                    temp = boxTypes[j][1];
                    boxTypes[j][1] = boxTypes[j+1][1];
                    boxTypes[j+1][1]=temp;

                    temp = boxTypes[j][0];
                    boxTypes[j][0] = boxTypes[j+1][0];
                    boxTypes[j+1][0]=temp;
                }
            }
        }
        int max_units =0;
        int count=0;
        for(int i=row-1;i>=0;i--){
            max_units+=boxTypes[i][0]*boxTypes[i][1];
            count+=boxTypes[i][0];

            if(count == truckSize){
                break;
            }
            if(count>truckSize){
                max_units-=boxTypes[i][0]*boxTypes[i][1];
                count-=boxTypes[i][0];
                int x = truckSize-count;
                count+=x;
                max_units+=x*boxTypes[i][1];

            }

        }

        return max_units;
    }
}

/*class Solution {//using comperator
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int row = boxTypes.length;
        int col = boxTypes[0].length;
        int r =0;
        int temp;
        Arrays.sort(boxTypes,(o1,o2)->o1[1]-o2[1]);
        int max_units =0;
        int count=0;
        for(int i=row-1;i>=0;i--){
            max_units+=boxTypes[i][0]*boxTypes[i][1];
            count+=boxTypes[i][0];

            if(count == truckSize){
                break;
            }
            if(count>truckSize){
                max_units-=boxTypes[i][0]*boxTypes[i][1];
                count-=boxTypes[i][0];
                int x = truckSize-count;
                count+=x;
                max_units+=x*boxTypes[i][1];

            }

        }

        return max_units;
    }
}*/