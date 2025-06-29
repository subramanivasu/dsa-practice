package arrays;

import java.util.ArrayList;

public class RearrangeArrayElementsBySign {

    public static int[] rearrangeArray(int[] nums) {
        int i=0;
        int j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while(i<nums.length && j<nums.length){
            if(nums[i]>0 && nums[j]<0){
                result.add(nums[i]);
                result.add(nums[j]);
                i++;
                j++;
            } else if(!(nums[i]>0)){
                i++;
            } else if(!(nums[j]<0)){
                j++;
            } else {
                i++;
                j++;
            }
        }
        int[] resultArray = new int[nums.length];
        for(int k=0;k<nums.length;k++){
            resultArray[k]=result.get(k);
        }

        return resultArray;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,-1,3,5,-5,-6};
        int[] result = rearrangeArray(nums);
        for(int num:result){
            System.out.print(num + " ");
        }

    }

}
