package LeetCode;

public class ReverseAString {
    // public static char[] newString = {};
    public static void printReverseString(char[] str, int index, int insert_index){
        char temp = ' ';
        if (insert_index>=index){
            for (char c: str){
                System.out.print(c + " ");
            }
            return;
        }
        temp = str[index];
        str[index] = str[insert_index];
        str[insert_index] = temp;
        printReverseString(str, index-1, insert_index+1);
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        printReverseString(s, s.length-1, 0);

    }
}
