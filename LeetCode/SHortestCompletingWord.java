package LeetCode;

public class SHortestCompletingWord {
    public static void main(String[] args) {
        String licensePlate = "1s3 PSt";
        String[] words = {"step","steps","stripe","stepple"};

        // licensePlate = licensePlate.replaceAll("[\\d\\s]", "").toLowerCase();
        // System.out.println(licensePlate);
        
        // for (String word: words){
        //     char[] wordList = word.toCharArray();
        //     for(char ch: licensePlate.toCharArray()) {

        //     }
        // }

        int[] licensePlateCounts = new int[26];

        for(char c: licensePlate.toCharArray()) {
              if(Character.isAlphabetic(c)) {
                  char ch = Character.toLowerCase(c);
                  licensePlateCounts[ch-'a']++;
              }
        }

        String ans = null;
        for (String s: words){
            int[] stringCounts = new int[26];
            
            for(Character c: s.toCharArray()){
                stringCounts[Character.toLowerCase(c)-'a']++;
            }

            for (int i = 0; i<26;i++){
                System.out.println(licensePlateCounts[i] + " "+ stringCounts[i]);

            }
            boolean exist = true;
            for(int i =0; i < 26; i++) {
                if(stringCounts[i] < licensePlateCounts[i]) {
                    exist = false;
                    break;
                } 
            }
            if(exist) {
                ans = (ans == null || s.length() < ans.length() ? s : ans);
            }
            System.out.println();
            System.out.println();
            System.out.println();

        }
        System.out.println(ans);
    }
}
