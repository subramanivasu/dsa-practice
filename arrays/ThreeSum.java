package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j=i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> currentTriplet = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));

                    if (resultList.isEmpty() || !resultList.get(resultList.size() - 1).equals(currentTriplet)) {
                         resultList.add(currentTriplet);
                    }
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j-1]) j++; 
                    while (j < k && nums[k] == nums[k+1]) k--; 
                    
                } else if(sum < 0){
                    j++;
                } else {
                    k--;
                }
            }
        }

        return resultList;
    }



    public static void main(String[] args) {
        int[] nums = new int[]{2, -1, -1, 3, -1};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);

    }

}
