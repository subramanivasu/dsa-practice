package strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagramString {
    public static boolean anagramStrings(String s, String t) {
        //your code goes here
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> charecterFrequency = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            charecterFrequency.put(s.charAt(i),charecterFrequency.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            charecterFrequency.put(t.charAt(i),charecterFrequency.getOrDefault(t.charAt(i),0)-1);
        }
    

        for(Integer val : charecterFrequency.values()){
            if(val!=0){
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {
        System.out.println(anagramStrings("anagram", "nagaram"));
    }
    
}
