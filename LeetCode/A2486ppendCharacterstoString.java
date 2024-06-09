package LeetCode;

public class A2486ppendCharacterstoString {
    public static int appendCharacters(String str, String subStr){
        int index1=0; 
        int index2=0;
        while(index1<str.length() && index2<subStr.length()){
            if (str.charAt(index1)==subStr.charAt(index2)){
                index2++;
            }
            index1++;
        }
        return (subStr.length()-index2);
    }
    public static void main(String[] args) {
        String s = "coaching";
        String t = "coding";
        System.out.println(appendCharacters(s, t));
    }
}
