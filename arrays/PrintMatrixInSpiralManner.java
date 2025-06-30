package arrays;

import java.util.ArrayList;
import java.util.List;

public class PrintMatrixInSpiralManner {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> resultArray = new ArrayList<>();

        int top=0; int bottom = matrix.length-1;
        int left = 0; 
        int right = matrix[0].length-1;


        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                resultArray.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                resultArray.add(matrix[i][right]);
            }
            right--;

            if(bottom>=top){
                for(int i=right;i>=left;i--){
                    resultArray.add(matrix[bottom][i]);
                }
                bottom--;
            }


            if(right>=left){
                for(int i=bottom;i>=top;i--){
                    resultArray.add(matrix[i][left]);
                }
                left++;
            }
            
        
        }

        return resultArray;

    }
    public static void main(String[] args) {
        List<Integer> result = spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6},{7,8,9}});
        System.out.println(result);

    }

}
