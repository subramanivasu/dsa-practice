package slidingwindow;

import java.util.HashMap;

public class LongSubstringKDistinctChar {

    public int kDistinctChar(String s, int k) {
        int l = 0;
    int r = 0;
    int maxCount = 1;

    HashMap<Character, Integer> hashMap = new HashMap<>();

    while (r < s.length()) {
      hashMap.put(s.charAt(r), hashMap.getOrDefault(s.charAt(r), 0) + 1);
      if (hashMap.size() > k) {
        hashMap.put(s.charAt(l), hashMap.getOrDefault(s.charAt(l), 0) - 1);
        if (hashMap.get(s.charAt(l)) == 0) {
          hashMap.remove(s.charAt(l));
        }
        l++;
      }
      if (hashMap.size() <= k) {
        maxCount = Math.max(maxCount, r - l + 1);
      }
      r++;
    }

    return maxCount;
        
    }

}
