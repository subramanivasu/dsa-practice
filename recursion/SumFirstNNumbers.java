package recursion;

public class SumFirstNNumbers {

     public static int NnumbersSum(int N) {
        if(N==0){
            return 0;
        }

        return N + NnumbersSum(N-1);
    }

    public static void main(String[] args) {
        System.out.println(NnumbersSum(4));
    }

}
