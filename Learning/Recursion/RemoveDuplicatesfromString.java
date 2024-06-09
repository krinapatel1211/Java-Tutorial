package Recursion;

public class RemoveDuplicatesfromString {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int index, String newString){
        if(index+1==str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        if(map[currentChar-'a']==false){
            newString += currentChar;
            map[currentChar-'a']=true;
        }
        removeDuplicates(str, index+1, newString);
    }
    public static void main(String[] args) {
        removeDuplicates("abbcccda", 0, "");
    }
}
