package Patterns;

public class NumberPyramid {
    public static void main(String[] args) {
        int n=5; 
        
        /*******************************
         * 
         * 
         *  This was my logic 
         * 
         * *****************************/
        // int count=1;
        // for (int i=n; i>0; i--){
        //     for (int j=1;j<=i;j++){
        //         if (j==i){
        //             for (int k=0; k<count; k++){
        //                 System.out.print(count + " ");
        //             }
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        //     count++;
        // }
        
        int spaces = 0;
        for (int i=1; i<=n; i++){
            spaces = n-i;
             // print initial spaces
             for (int j=0; j<spaces; j++){
                System.out.print(" ");
             }
             // print the number i times
             for (int j=0; j<i; j++){
                System.out.print(i + " ");
             }
             // print trailing spaces
             System.out.println();
        }
    }
}
