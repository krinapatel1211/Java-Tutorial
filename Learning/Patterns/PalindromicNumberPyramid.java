package Patterns;

public class PalindromicNumberPyramid {
    public static void main(String[] args) {
        /*******************************
         * 
         * 
         *  This was my logic 
         * 
         * *****************************/

        // int n=15; int count=1;
        // for (int i=n; i>0; i--){
        //     for (int j=1; j<=n; j++){
        //         if (i==j){
        //             for (int k=count; k>0; k--){
        //                 System.out.print(k);
        //             }
        //             for (int l=1; l<count; l++){
        //                 System.out.print(l+1);
        //             }
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        //     count++;
        // }
        int n=5; int spaces=0;
        for (int i=1; i<=n; i++){
            spaces = n-i;
            // print the spaces
            for(int j=0; j<spaces; j++){
                System.out.print("  ");
            }
            // print the numbers
            for (int j=i; j>0; j--){
                System.out.print(j + " ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    
    }
}
