package arrays;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                element=nums[i];
                count=1;
            } else if(nums[i]==element){
                count++;
            } else {
                count--;
            }
        }

        int count1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element){
                count1++;
            }
        }

        if(count1>(nums.length/2)){
            return element;
        }

        return -1;
        
    }




    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 1, 2};
        int result = majorityElement(nums);
        System.out.print(result);
        

    }

}
