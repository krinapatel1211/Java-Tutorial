package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorse {
    public static void main(String[] args) {
        String[] uniqueStrings = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] words = {"gin","zen","gig","msg"};
        String[] uniqueWords = new String[words.length];
        int index = 0;

        for(String word: words){
            uniqueWords[index]="";
            for(Character c: word.toCharArray()){
                uniqueWords[index] += uniqueStrings[c-'a'];
            }
            index++;
        }
        Set<String> set = new HashSet<>();

        for (String u:uniqueWords){
            set.add(u);
        }
        System.out.println(set.size());
        
        
    }
}
