package greedy;

public class JumpGame1 {
    public boolean canJump(int[] nums) {
        
        int maxIndex = 0;

        for(int i=0;i<nums.length;i++){
            if(i>maxIndex){return false;}
            maxIndex=Math.max(maxIndex, i+nums[i]);
            if(maxIndex>nums.length-1){
                return true;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        JumpGame1 jumpGame = new JumpGame1();

        // Test case 1: Can jump to the last index
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println("Test case 1: " + jumpGame.canJump(nums1)); // Expected: true

        // Test case 2: Cannot jump to the last index
        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println("Test case 2: " + jumpGame.canJump(nums2)); // Expected: false

        // Test case 3: Single element array
        int[] nums3 = {0};
        System.out.println("Test case 3: " + jumpGame.canJump(nums3)); // Expected: true

        // Test case 4: All elements are zero except the first
        int[] nums4 = {1, 0, 0, 0};
        System.out.println("Test case 4: " + jumpGame.canJump(nums4)); // Expected: true

        // Test case 5: Large jump at the beginning
        int[] nums5 = {5, 0, 0, 0, 0};
        System.out.println("Test case 5: " + jumpGame.canJump(nums5)); // Expected: true
    }
}
