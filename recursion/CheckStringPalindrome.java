package recursion;

public class CheckStringPalindrome {

    public static boolean palindromeCheck(String s) {
        //your code goes here
        boolean result = false;
        if(s.isEmpty()){
            result = true;
            return result;
        } 
        if(s.charAt(0)==s.charAt(s.length()-1)){
            result = palindromeCheck(s.substring(1,s.length()-1));
        } else {
            result =  false;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(palindromeCheck("hanbah"));
    }

}
