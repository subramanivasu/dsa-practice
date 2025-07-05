package arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceArray {

    public static int longestConsecutive(int[] nums) {

        if(nums.length==0){
            return 0;
        }

        Set<Integer> numbers = new HashSet<>();

        int longest = 1;

        for(int i=0;i<nums.length;i++){
            numbers.add(nums[i]);
        }

        for(int num: numbers){
            if(!numbers.contains(num-1)){
                int count = 1;
                int x = num;

                while(numbers.contains(x+1)){
                    x+=1;
                    count+=1;
                }

                longest =  Math.max(longest,count);
            }
        }


        return longest;
    }




    public static void main(String[] args) {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        int result = longestConsecutive(nums);
        System.out.print(result);
        

    }

}
