package recursion;

public class SumOfDigitsInANumber {

    public static int addDigits(int num) {
        //your code goes here
        if(num == 0){
            return 0;
        }
        while(true){
            num=(num%10) + addDigits(num/10);
            if(num/10==0){
                break;
            }
        }
        
        return num;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(25));
    }

}
