package recursion;

public class ReverseArray {

    public static int[] reverseArray(int[] nums) {
        //your code goes here

        nums = reverse(nums,0,nums.length-1);

        return nums;


        
    }

    public static int[] reverse(int[] nums, int left, int right){

        if(left>=right){
            return nums;
        }

        int temp = nums[left];
        nums[left]=nums[right];
        nums[right]=temp;

        nums = reverse(nums,left+1,right-1);

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = reverseArray(new int[]{2,3,5,4,6,7});

        for(int num: nums){
            System.out.print(num);
        }

    }

}
