package recursion;
import java.util.*;
public class CheckIfArrayIsSorted {

    public static boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here
        boolean result;
        

        result = sorted(nums,0,1);

        return result;

    }

    public static boolean sorted(ArrayList<Integer> nums,int left,int right){



        if(left==nums.size()-1){
            return true;
        }

        if(nums.get(left)<=nums.get(right)){
            return sorted(nums,left+1,right+1);
        } else{
            return false;
        }


    }

    public static void main(String[] args) {
        System.out.println(isSorted(new ArrayList<>(List.of(1,2,3,4,5))));
        System.out.println(isSorted(new ArrayList<>(List.of(11,4,2,6,4,2))));
        System.out.println(1/10);

    }

}
