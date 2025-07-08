package binarysearch;

public class SearchInA2DMatrix {
    public static boolean searchMatrix(int[][] mat, int target) {

        int m = mat.length;
        int n = mat[0].length;
        int low = 0;
        int high = (m*n) -1;

        while(low<=high){
            int mid = (low+high)/2;

            if(mat[mid/n][mid%n]==target){
                return true;
            } else if(mat[mid/n][mid%n]<target){
                low=mid+1;
            } else {
                high=mid-1;
            }
        }

        return false;
    } 
    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}, 8));
        
    }
}
