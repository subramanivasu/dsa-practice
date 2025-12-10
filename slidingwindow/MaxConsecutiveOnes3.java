package slidingwindow;

public class MaxConsecutiveOnes3 {
    public static int longestOnes(int[] nums, int k) {

        int maxLen = 0;
        int l=0;
        int r=0;
        int zeros=0;
        while(r<nums.length){
            if(nums[r]==0){
                zeros++;
            }

            if(zeros>k){
                if(nums[l]==0){zeros--;}
                l++;
            }
            if(zeros<=k){
                maxLen = Math.max(r-l+1,maxLen);
            }
            r++;
        }

        return maxLen;
        
    }

    public static void main(String[] args) {
        int[] input = {1,1,1,1,1,1,0,0,0,1,1,0,0,1,1,1,1,0};
        int k = 3;  
 
        
        int length = longestOnes(input, k);
        

        System.out.println("Length of longest substring with at most " + k + " zeros: " + length);
    }
}
