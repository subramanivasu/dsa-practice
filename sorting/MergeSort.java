package sorting;

import java.util.ArrayList;

public class MergeSort {

    public static int[] mergeSort(int[] nums) {
        
        mergeSortHelper(nums,0,nums.length-1);

        return nums;

    }

    public static void mergeSortHelper(int[] nums,int low,int high){

        if(low==high){
            return;
        }

        int mid = (low+high)/2;

        mergeSortHelper(nums, low, mid);
        mergeSortHelper(nums,mid+1,high);
        merge(nums,low,mid,high);
    }

     public static void merge(int[] nums,int low,int mid,int high){
        int i = low;
        int j = mid+1;

        ArrayList<Integer> temp = new ArrayList<>();

        while(i<=mid && j<=high){
            if(nums[i]<nums[j]){
                temp.add(nums[i]);
                i++;
            } else {
                temp.add(nums[j]);
                j++;
            }
        }

        while(i<=mid){
            temp.add(nums[i]);
            i++;
        }

        while(j<=high){
            temp.add(nums[j]);
            j++;
        }

        for(Integer val : temp){
            nums[low] = val;
            low++; 
        }

     }

    public static void main(String[] args) {
        int[] result = mergeSort(new int[]{9,7,13,2,14});
        for(int num:result){
            System.out.print(num + " ");
        }

    }

}
