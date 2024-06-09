package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        Set<String> set = new HashSet<>();
        String[] paragraghWords = paragraph.split("\\W+");

        for (String word : paragraghWords) {
            set.add(word);
        }
            

        
        

    }   
}
