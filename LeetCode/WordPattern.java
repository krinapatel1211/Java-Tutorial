package LeetCode;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba"; 
        String s = "dog cat cat dog";
        String[] words = s.split("\\s+");
        int length_pattern = pattern.length();
        boolean flag=false;
        
        for(int i=0; i<length_pattern/2; i++){
            if ((pattern.charAt(i)!=pattern.charAt(length_pattern-i-1)) || (words[i].compareTo(words[length_pattern-i-1]))!=0){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("NOT Palindrome");
        }
        

        
    }
}
