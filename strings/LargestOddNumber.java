package strings;


public class LargestOddNumber {
    public static  String largeOddNum(String s) {
        //your code goes here
        int firstDigit = 0;

        while(firstDigit < s.length() && s.charAt(firstDigit)=='0'){
            firstDigit++;
        }

        int lastDigit = s.length() - 1;

        while(lastDigit >=firstDigit && s.charAt(lastDigit) == '0'){
            lastDigit--;
        }

        String strippedStr = s.substring(firstDigit,lastDigit+1);

        for(int i= strippedStr.length() -1; i>=0; i--){
            char digitChar = strippedStr.charAt(i);
            int val = Character.getNumericValue(digitChar);

            if(val%2!=0){
                return strippedStr.substring(0,i+1);
            }

        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println(largeOddNum("00234565432"));
    }
    
}
