
public class Permutaions {

    public static void printPermutaions(String str, String perm, int index){
        if (str.length()==0){
            System.out.println(perm);
            return;
        }
        for (int i=0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutaions(newStr, perm + currentChar, index+1);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        printPermutaions(str, "", 0);
    }
}
