package LeetCode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String text = strs[0];
        String commonPrefix = "";
        for (int i=1, j=0; i<strs.length; i++, j++){
            System.out.println(strs[i] + " " + strs[i].charAt(j) + " " + text.charAt(j) );
            // if (strs[i].charAt(i) == text.charAt(i)){
            //     System.out.println();
            // }
        }
    }
}
