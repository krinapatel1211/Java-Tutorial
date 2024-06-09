package Other;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int row = 4;
        int column = 5;
        int numbertoSearch = 5;
        int numbers[][] = new int[row][column];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Indices where " + numbertoSearch + " is found are: ");
        for(int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                if (numbers[i][j] == numbertoSearch){
                    System.out.print("("+i + ", " + j+"), ");
                }
            }
        }
        sc.close();
    }
    
}
