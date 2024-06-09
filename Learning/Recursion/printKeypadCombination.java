package Recursion;

public class printKeypadCombination {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printKeypadCombinations(String pressStr, int index, String combination){
        if (index == pressStr.length()){
            System.out.println(combination);
            return;
        }

        char currentChar = pressStr.charAt(index);
        String mapping = keypad[currentChar-'0'];
        
        for (int i=0; i<mapping.length(); i++){
            printKeypadCombinations(pressStr, index+1, combination+mapping.charAt(i));
        }
        
    }     
    public static void main(String[] args) {
        String pressStr="02";
        printKeypadCombinations(pressStr, 0, "");
    }
}
