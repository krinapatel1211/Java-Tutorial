package LeetCode;

public class LengthofLastword {
    public static void main(String[] args) {
        String s = "Hello       World     ";
        // System.out.println(s);

        // s = s.trim();
        // System.out.println(s);

        // String[] words = s.split("\\s+");
        // System.out.println(words[words.length - 1].length());
        int count=0;
        s=s.trim();
        for(int i=s.length()-1; i>=0; i--){
            if (s.charAt(i)==' '){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
