package arrays;

public class MoveZerosToEnd {

    public static void moveZeroes(int[] nums) {
        int postOfZero=0;
        int lastPost = nums.length;
        boolean set = false;
        int i = 0;
        while(i<lastPost-1){
            System.out.println("i pos: " + i);
            if(nums[i]!=0){
                i++;
            } else {
                while(i < lastPost-1){
                    swap(nums,i+1,i);
                    i++;
                    if(nums[i-1]==0 && set==false){
                        postOfZero=i-1;
                        System.out.println("postOfZero upgraded: " + postOfZero);
                    }
                }
                lastPost--;
                set=false;
            }
        }
    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,2,0,4,6,5};
        moveZeroes(nums);
        for(int num:nums){
            System.out.print(num + " ");
        }

    }

}
