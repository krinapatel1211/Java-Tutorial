package Recursion;

import java.util.HashSet;

public class SubsequencesOfString {
    public static void printSubsequences(String str, int index, String newString, HashSet<String> set){
        if (index == str.length()){
            if (set.contains(newString)){
                return;
            }
            else{
                set.add(newString);
                System.out.println(newString);
                return;
            }
        }
        char current_char = str.charAt(index);

        //to be in the string
        printSubsequences(str, index+1, newString+current_char, set);

        //choose not to be in the string
        printSubsequences(str, index+1, newString, set);
    }
    public static void main(String[] args) {
        String s = "abc";
        HashSet<String> set = new HashSet<>();
        printSubsequences(s, 0, "", set);
        System.out.println(set);
       
    }
}
