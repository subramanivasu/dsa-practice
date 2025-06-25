package recursion;

import java.util.*;

public class SumOfArrayElements {

    public static int arraySum(int[] nums) {
        //your code goes here


        if(nums.length==1){
            return nums[0];
        }
        

        return nums[0] + arraySum(Arrays.copyOfRange(nums, 1, nums.length));
    }

    public static void main(String[] args) {
        System.out.println(arraySum(new int[]{2,4,6,8}));
    }

}
