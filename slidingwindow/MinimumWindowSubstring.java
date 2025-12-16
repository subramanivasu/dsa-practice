package slidingwindow;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        //your code goes here
        int l = 0;
        int r = 0;
        int minLen = Integer.MAX_VALUE;
        int minIndex = -1;
        int count = 0;
        int m = t.length();
        int[] hash = new int[256];

        for (int i = 0; i < m; i++) {
            hash[t.charAt(i)]++;
        }

        while (r < s.length()) {
            if (hash[s.charAt(r)] > 0) {
                count++;
            }
        hash[s.charAt(r)]--;

        while (count == m) {
            if (r - l + 1 < minLen) {
                minLen = r - l + 1;
                minIndex = l;
            }
            hash[s.charAt(l)]++;
            if (hash[s.charAt(l)] > 0) {
                count--;
            }
            l++;
        }
            r++;
        }

        return (minIndex == -1) ? "" : s.substring(minIndex, minIndex + minLen);
        
    }
}
