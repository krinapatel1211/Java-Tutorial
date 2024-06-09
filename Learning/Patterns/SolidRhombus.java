package Patterns;

public class SolidRhombus {
    public static void main(String[] args) {
        int n=5;
        /*******************************
         * 
         * 
         *  This was my logic 
         * 
         * *****************************/
        // for (int i=0; i<n; i++){
        //     for (int j=0; j<n; j++){
        //         if (n-i-1==j){
        //             for (int k=0; k<n; k++){
        //                 System.out.print("*");
        //             }
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        int spaces=0;
        for (int i=1; i<=n; i++){
            spaces = n-i;
            for (int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            for (int j=0;j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
