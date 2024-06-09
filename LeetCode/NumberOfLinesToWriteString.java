package LeetCode;

public class NumberOfLinesToWriteString {
    public static void main(String[] args) {
        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        int pixels = 0;
        int possibility = 1;
        int result[] = new int[2];
         for(Character ch: s.toCharArray()){
            int temp = pixels + widths[ch-'a'];
            if (temp<=100){
                pixels += widths[ch-'a'];
            }
            else{
                possibility++;
                System.out.println(pixels + " " + possibility);
                pixels=0;
            }
        }
        System.out.println(pixels + " " + possibility);
    }
}
