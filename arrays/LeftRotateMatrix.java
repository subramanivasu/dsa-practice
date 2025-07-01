package arrays;

public class LeftRotateMatrix {

    public static void rotateMatrix(int[][] matrix) {
        int left= 0;
        int top = 0;
        int n = matrix.length;
        while(left!=(n-1)){
            int i = top+1;
            int j = left+1;

            while(j<n){
                swap(matrix,i,j,top,left);
                i++;
                j++;
            }
            left++;
            top++;
        }

        for(int k=0;k<n;k++){
            int i = 0;
            int j = n-1;
            while(i<j){
                int temp = matrix[k][j];
                matrix[k][j]=matrix[k][i];
                matrix[k][i]=temp;
                i++;
                j--;
            }
        }
    }

    public static void swap(int[][] matrix,int i,int j,int top,int left){
        int temp = matrix[top][j];
        matrix[top][j]=matrix[i][left];
        matrix[i][left]=temp;
    }
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6},{7,8,9}};
        rotateMatrix(matrix);
   

    }

}
