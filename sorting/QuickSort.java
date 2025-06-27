package sorting;

import java.util.Random;

public class QuickSort {

    public static int[] quickSort(int[] nums) {
        //let's first calculate the length of array
        int length = nums.length;

        //lets call a quickSort Helper
        quickSortHelper(nums,0,length-1);

        return nums;
    }

    //let's write the quickSortHelper
    //So this will basicaly place the elements lower than pivot to the left and higher than the pivot to right and we recursively call the quickSort as long as low is lesser than high
    public static void quickSortHelper(int[] nums,int low,int high){
        if(low<high){
            int partitionIndex = partition(nums,low,high);
            quickSortHelper(nums,low,partitionIndex-1);
            quickSortHelper(nums,partitionIndex+1,high);
        }
    }

    //let's write a partition Function
    public static int partition(int[] nums,int low, int high){

        int randomIndex = low + new Random().nextInt(high - low + 1);

        int temp = nums[low];
        nums[low]=nums[randomIndex];
        nums[randomIndex] = temp;

        int pivot = nums[low];

        int i = low;
        int j = high;

        while(i<j){
            while(nums[i]<=pivot && i<high){
                i++;
            }
            while(nums[j]>pivot && j>low){
                j--;
            }

            if(i<j){
                int tmp = nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
            }
        }

        int tmp = nums[j];
        nums[j]=nums[low];
        nums[low]=tmp;

        return j;

    }

    public static void main(String[] args) {
        int[] result = quickSort(new int[]{97,3,6,2,9,1,10,3});
        for(int num:result){
            System.out.print(num + " ");
        }

    }

}
