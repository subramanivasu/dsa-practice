package recursion;

public class CheckIfNumberIsPrime {

    public static boolean checkPrime(int num) {
        //your code goes here

        if(num<=1){
            return false;
        }

        return helper(num,2);
    }

    public static boolean helper(int num,int x){

        if(x > Math.sqrt(num)){
            return true;
        }

        if(num%x==0){
            return false;
        }

        return helper(num,x+1);

    }

    public static void main(String[] args) {
        System.out.println(checkPrime(17));
    }

}
