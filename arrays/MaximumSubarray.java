package arrays;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int val: nums){
            sum+=val;
            if(sum>max){
                max = sum;
            }
            if(sum<0){
                sum=0;
            }
        }

        return max;
    }




    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(nums);
        System.out.print(result);
        

    }

}
