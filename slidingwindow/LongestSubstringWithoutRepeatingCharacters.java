package slidingwindow;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {
    public int longestNonRepeatingSubstring(String s) {
        //your code goes here
        
        int l=0;
        int r=0;
        int len = Integer.MIN_VALUE;
        int n = 1;
        int[] hashArray = new int[256];

        Arrays.fill(hashArray,-1);

        while(r<s.length()){
            if(hashArray[r]>=l){
                l = hashArray[r]+1;
                len = Math.max(n, len);
                n=1;
            }
            n++;
            r++;
        }

        return len;
    }

}
