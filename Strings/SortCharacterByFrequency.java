import java.util.*;


class Pair {
    int freq;
    char ch;

    Pair(int freq,char ch){
        this.freq=freq;
        this.ch=ch;
    }
}

public class SortCharacterByFrequency {

    //first, you create a Class that repreents a charecter and it's frequency
    //we then create an array of Pairs and initialize them with zero frequency count for each character in the English characters
    //we then count the frequency for each character in the input string and increment the frequency in the Frequency pair array
    //then let's  sort the frequency pair array, first buy the character frequency then by the character precedence, that is, if two character frequencies are the same,
    // we sort by the ascending order

     public static List<Character> frequencySort(String s) {

        List<Character> result = new ArrayList<>();

        Pair[] freq = new Pair[26];

        for(int i=0;i<26;i++){
            Pair newPair = new Pair(0,(char)(i+'a'));
            freq[i]=newPair;
        }



        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a'].freq++;
        }

        Arrays.sort(freq,(p1,p2) -> {
            if(p1.freq!=p2.freq){
                return p2.freq-p1.freq;
            }

            return p1.freq-p2.freq;
        });

        for(Pair p : freq){
            if(p.freq>0)result.add(p.ch);
        }

        return result;


    }

    public static void main(String[] args) {
        System.out.println(frequencySort("bbbaaaafffffppp"));
    }
    



    
}
