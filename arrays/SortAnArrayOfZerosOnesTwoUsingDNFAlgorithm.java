package arrays;



public class SortAnArrayOfZerosOnesTwoUsingDNFAlgorithm {

    public static void sortZeroOneTwo(int[] nums) {
        int low=0;
        int mid=0;
        int high = nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            } else if(nums[mid]==1){mid++;}
            else {
                swap(nums,mid,high);
                high--;
            }
        }
    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }



    public static void main(String[] args) {
        int[] nums = new int[]{1,1,0,2,2,0,0,1,1,0};
        sortZeroOneTwo(nums);
        for(int num:nums){
            System.out.print(num + " ");
        }

    }

}
