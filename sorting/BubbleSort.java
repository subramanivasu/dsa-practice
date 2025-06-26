package sorting;
public class BubbleSort {

    public static int[] bubbleSort(int[] nums) {

        int length = nums.length;
        for(int i=nums.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(nums[j]>nums[j+1]){
                    swap(nums,j+1,j);
                }
            }
        }

        return nums;
    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args) {
        int[] result = bubbleSort(new int[]{9,7,13,2,14});
        for(int num:result){
            System.out.print(num + " ");
        }

    }

}
