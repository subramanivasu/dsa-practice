package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm = new HashMap<>();
        int[] pair = new int[2];

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            
            if(hm.containsKey(target-nums[i]) && hm.get(target-nums[i])!=i){
                pair[0]=i;
                pair[1]=hm.get(target-nums[i]);
                return pair;
            }
        }

        return pair;
        
    }
    public static void main(String[] args) {
        int[] nums = new int[]{9,7,13,2,14};
        int[] result = twoSum(nums,9);
        for(int num:result){
            System.out.print(num + " ");
        }

    }

}
