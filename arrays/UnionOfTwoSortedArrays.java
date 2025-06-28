package arrays;

import java.util.ArrayList;

public class UnionOfTwoSortedArrays {

    public static int[] unionArray(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;

        ArrayList<Integer> temp = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
        if (nums1[i] <= nums2[j]) {
            if(!temp.isEmpty() && temp.get(temp.size()-1) == nums1[i]){
                i++;
            } else {
                temp.add(nums1[i]);
                i++;
                
            }

        } else {
            if (!temp.isEmpty() && temp.get(temp.size()-1) == nums2[j]) {
            j++;
            } else {
            temp.add(nums2[j]);
            }
        }
        }

        while (i < nums1.length) {
        if (temp.get(temp.size()-1) != nums1[i]) {
            temp.add(nums1[i]);
            i++;
        } else {
            i++;
        }
        }

        while (j < nums2.length) {
        if (temp.get(temp.size()-1) != nums2[j]) {
            temp.add(nums2[j]);
            j++;
        } else {
            j++;
        }
    }

        int[] unionArray = new int[temp.size()];

        for (int k = 0; k < temp.size(); k++) {
            unionArray[k] = temp.get(k);
        }

        return unionArray;
  }

    public static void main(String[] args) {
        int[] nums1 = new int[]{3, 4, 6, 7, 9, 9};
        int[] nums2 = new int[]{1, 5, 7, 8, 8};
        int[] result = unionArray(nums1, nums2);
        for(int num:result){
            System.out.print(num + " ");
        }

    }

}
