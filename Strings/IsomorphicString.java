import java.util.*;

class Solution {
    public static boolean isomorphicStringHashMap(String s, String t) {

        Map<Character,Character> sToT = new HashMap<>();
        Map<Character,Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);


            if (!sToT.containsKey(charS) && !tToS.containsKey(charT)) {
                sToT.put(charS, charT);
                tToS.put(charT, charS);
            }

            else if (sToT.containsKey(charS) && tToS.containsKey(charT)) {
                if (sToT.get(charS) != charT || tToS.get(charT) != charS) {
                    return false; 
                }
            }
            else {
                return false;
            }
        }

        return true;
    }

     public static boolean isomorphicStringArray(String s, String t){

        int[] stringS  = new int[256];
        int[] stringT = new int[256];

        for(int i=0;i<t.length();i++){
            if(!(stringS[s.charAt(i)]==stringT[t.charAt(i)])){
                return false;
            }
            stringS[s.charAt(i)] = i + 1;
            stringT[t.charAt(i)] = i+1;
        }

        return true;
     }

}


public class IsomorphicString{
    public static void main(String[] args) {

        boolean result = Solution.isomorphicStringHashMap("egg", "add");
        System.out.println(result);
        boolean result2 = Solution.isomorphicStringArray("apple", "bbnbm");
        System.out.println(result2);

        
    }
}