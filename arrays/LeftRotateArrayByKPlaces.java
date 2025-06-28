package arrays;

public class LeftRotateArrayByKPlaces {

    public static void iterativeRotateArray(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }

        for (int i = k; i < nums.length; i++) {
            nums[i - k] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            nums[n - k + i] = temp[i];
        }
    }

    public static void optimalRotateArray(int[] nums, int k) {
        int n = nums.length;
            
        k = k%n;


        reverseArray(nums,0,k-1);
        reverseArray(nums,k,n-1);
        reverseArray(nums,0,n-1);
    }

        public void rotateArray(int[] nums, int k) {
        int n = nums.length;

        k = k % n;


        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, n - 1);
        reverseArray(nums, 0, n - 1);
    }

    public static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9,7,13,2,15,21};
        iterativeRotateArray(nums,8);
        for(int num:nums){
            System.out.print(num + " ");
        }

        System.out.println();
        
        int[] nums1 = new int[]{1,2,3,4,5,6,7};

        optimalRotateArray(nums1,3);
        for(int num:nums1){
            System.out.print(num + " ");
        }

    }

}
