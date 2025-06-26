package sorting;
public class SelectionSort {

    public static int[] selectionSort(int[] nums) {

        for(int i=0;i<nums.length;i++){
            int min = i;
            for(int j=i;j<nums.length;j++){
                if(nums[j]<nums[min]){
                    min = j;
                }
            }

            int temp = nums[i];
            nums[i]=nums[min];
            nums[min]=temp;

        }

        return nums;

    }

    public static void main(String[] args) {
        int[] result = selectionSort(new int[]{9,7,13,2,14});
        for(int num:result){
            System.out.print(num + " ");
        }

    }

}
