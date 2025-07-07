package binarysearch;

public class SearchInARotatedSortedArray {
    public static int search(int[] nums, int k) {
       
       int low = 0;
       int high = nums.length - 1;

       while(low<=high){

            int mid = (low+high)/2;
            if(nums[mid]==k){
                return mid;
            }

            if(nums[low]<=nums[mid]){
                if(nums[low]<=k && k<=nums[mid]){
                    high=mid-1;
                } else {
                    low=mid+1;
                }

            } else {
                if(k<=nums[high] && nums[mid]<=k){
                    low=mid+1;
                } else {
                    high=mid-1;
                }

            }
       }

        return -1;
    } 
    public static void main(String[] args) {
        int result = search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        System.out.println(result);
        
    }
}
