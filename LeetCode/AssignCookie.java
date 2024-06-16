package LeetCode;
import java.util.Arrays;
public class AssignCookie {
    public static void main(String[] args) {
        int[] g = {10,9,8,7};
        int[] s = {5,6,7,8};
        int count=0; int i=0; int j=0;

        Arrays.sort(g);
        Arrays.sort(s);
        while (i<g.length && j<s.length){
            if (s[j]>=g[i]){
                count++;
                i++;
            }
            j++;
        }
        System.out.println(count);
    }
}
