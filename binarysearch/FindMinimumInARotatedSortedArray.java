package binarysearch;

public class FindMinimumInARotatedSortedArray {
    public static int findMin(int[] nums) {
      int ans = Integer.MAX_VALUE;

      int low = 0;
      int high = nums.length - 1;

      while(low <= high){
        int mid = (low + high) / 2;
        if(nums[low] <= nums[mid]){
            ans = Math.min(ans, nums[low]);
            low = mid + 1;
        } else {
            ans = Math.min(ans, nums[mid]);
            high = mid - 1;
        }
      }

      return ans;
    }
     public static void main(String[] args) {
        int result = findMin(new int[]{4, 5, 6, 7, -1,0, 1, 2});
        System.out.println(result);
        
    }
}
