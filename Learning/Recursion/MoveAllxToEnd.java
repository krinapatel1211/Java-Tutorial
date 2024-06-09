package Recursion;

public class MoveAllxToEnd {

    public static void moveXtoEnd(String str, String newString, int index, int count){
        if (index == str.length()){
            for (int i=0;i<count; i++){
                newString += 'x';
            }
            System.out.print(newString);
            return;
        }
        char currentChar = str.charAt(index);
        if (currentChar=='x'){
            count++;
        }
        else{
            newString += currentChar;
        }
        moveXtoEnd(str, newString, index+1, count);
    }
    public static void main(String[] args) {
        String s= "axbcxxd";
        moveXtoEnd(s, "", 0, 0);

    }
}
