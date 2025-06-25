package recursion;

public class FactorialOfAGivenNumber {

     public static int factorial(int N) {
        if(N==0){
            return 1;
        }

        return N*factorial(N-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

}
