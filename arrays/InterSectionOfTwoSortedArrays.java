package arrays;

import java.util.ArrayList;

public class InterSectionOfTwoSortedArrays {

    public static int[] intersectionArray(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> temp = new ArrayList<>();
        int i=0;
        int j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                temp.add(nums1[i]);
                i++;
                j++;
            } else if(nums1[i]<nums2[j]){
                i++;
            } else {
                j++;
            }
        }

        int[] intersectingArray = new int[temp.size()];
        for(int k=0;k<temp.size();k++){
            intersectingArray[k]=temp.get(k);
        }

        return intersectingArray;


    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{3, 4, 6, 7, 9, 9};
        int[] nums2 = new int[]{1, 5, 7, 8, 8};
        int[] result = intersectionArray(nums1, nums2);
        for(int num:result){
            System.out.print(num + " ");
        }

    }

}
