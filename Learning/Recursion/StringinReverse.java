package Recursion;

public class StringinReverse {

    public static void printReverseString(int index, String s){
        if (index<0){
            return;
        }
        System.out.print(s.charAt(index));
        printReverseString(--index, s);

    }
    public static void main(String[] args) {
        String str = "abcd";
        int index = str.length()-1;
        System.out.print("Reverse String = ");
        printReverseString(index, str);
    }
}
