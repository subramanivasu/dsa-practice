package arrays;

public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        
        int max = Integer.MIN_VALUE; 
        int prefix = 1;
        int suffix = 1;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(prefix==0){prefix=1;}
            if(suffix==0){suffix=1;}
            prefix*=nums[i];
            suffix*=nums[n-i-1];
            max = Math.max(max,Math.max(prefix,suffix));
        }

        return max; 
    }




    public static void main(String[] args) {
        int[] nums = new int[]{1, -2, 3, 4, -4, -3};
        int result = maxProduct(nums);
        System.out.print(result);
        

    }

}
