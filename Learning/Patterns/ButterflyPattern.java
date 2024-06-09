package Patterns;

public class ButterflyPattern {
    public static void main(String[] args) {
        int n=10; int spaces=0;
        /*******************************
         * 
         * 
         *  This was my logic 
         * 
         * *****************************/
        // // upper half
        // for (int i=0;i<n;i++){
        //     spaces=2*(n-i-1);
        //     for (int j=0;j<2*n;j++){
        //         if (j<=i || j>spaces+i){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // for (int i=n; i>0; i--){
        //     spaces = 2*(n-i);
        //     for (int j=0; j<2*n; j++){
        //         if (j<i || )
        //     }
        // }


        //Here goes the easy logic
        for (int i=1; i<=n; i++){
            // 1st half
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            //spaces
            spaces = 2*(n-i);
            for(int j=0; j<spaces ; j++){
                System.out.print(" ");
            }

            //2nd half
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for(int i=n; i>0; i--){
            // first half
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            //spaces
            spaces = 2*(n-i);
            for (int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            //2nd half
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
