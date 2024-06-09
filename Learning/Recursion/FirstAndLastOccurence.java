package Recursion;

public class FirstAndLastOccurence {
    public static int first = -1;
    public static int last = -1; 
    
    public static void firstLastOccurence(String str, int index, char element){
        if (index == str.length()){
            System.out.println("First Occurence = " + first);
            System.out.println("Last Occurence = " + last);
            return;
        }
        char current_char = str.charAt(index);
        if (current_char==element){
            if (first==-1){
                first = index;
            }
            else{
                last = index;
            }
        }
        firstLastOccurence(str, index+1, element);
    }
    public static void main(String[] args) {
        String s = "abaacdaefaah";
        firstLastOccurence(s, 0, 'a');
    }
}
