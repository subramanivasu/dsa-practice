package arrays;



public class SortAnArrayOfZerosOnesTwo {

    public static void sortZeroOneTwo(int[] nums) {
        
        int countZero=0;
        int countOne=0;
        int countTwo=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                countZero++;
            } else if(nums[i]==1){
                countOne++;
            } else {
                countTwo++;
            }
        }

        for(int i=0;i<countZero;i++){
            nums[i]=0;
        }
        for(int i=countZero;i<(countZero+countOne);i++){
            nums[i]=1;
        }
        for(int i=(countZero+countOne);i<nums.length;i++){
            nums[i]=2;
        }
    }



    public static void main(String[] args) {
        int[] nums = new int[]{1,1,0,2,2,0,0,1,1,0};
        sortZeroOneTwo(nums);
        for(int num:nums){
            System.out.print(num + " ");
        }

    }

}
