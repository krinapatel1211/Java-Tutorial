package Recursion;

public class PermutationsOfString {
    public static void printPermutations(String str, String permutations){
        if(str.length()==0){
            System.out.println(permutations);
            return;
        }
        for (int i=0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            String newString =  str.substring(0, i) + str.substring(i+1);
            printPermutations(newString, permutations+currentChar);

        }
    }
    public static void main(String[] args) {
        String s = "abc";
        printPermutations(s, "");
    }
}
