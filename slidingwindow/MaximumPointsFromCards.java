package slidingwindow;

public class MaximumPointsFromCards {

    public int maxScore(int[] cardPoints, int k) {
        int lSum=0;
        int rSum=0;
        int maxSum=0;
        int i=0;
        while(i<k){
          lSum+=cardPoints[i];
          i++;
        }
        maxSum=lSum;
        int j = cardPoints.length-1;
        i--;
        for(;i>=0;i--){
            lSum-=cardPoints[i];
            rSum+=cardPoints[j];
            maxSum=Math.max(maxSum,lSum+rSum);
            j--;
        }

        return maxSum;
    }

}
