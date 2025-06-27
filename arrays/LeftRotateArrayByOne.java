package arrays;

public class LeftRotateArrayByOne {

    public static void rotateArrayByOne(int[] nums) {
        int firstElement = nums[0];

        for(int i=0;i<nums.length-1;i++){
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=firstElement;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{9,7,13,2,14};
        rotateArrayByOne(nums);
        for(int num:nums){
            System.out.print(num + " ");
        }

    }

}
