package strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] str) {
        //your code goes here
        StringBuilder result = new StringBuilder();

        Arrays.sort(str);
        String first= str[0];
        String last = str[str.length - 1];

        for(int i=0; i< Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                return result.toString();
            } else {
                result.append(first.charAt(i));
            }
        }

        return result.toString();

    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"caroline","cars","caramel","carolina"}));
    }
    
}
