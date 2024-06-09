package Patterns;

public class Diamond {
    public static void main(String[] args) {
        int n=4; int spaces =0; int stars=0;
        // Upper half
        for (int i=1; i<=n; i++){
            spaces = n-i;
            // print the spaces
            for (int j=0; j<spaces; j++){
                System.out.print("  ");
            }
            // print stars
            stars = (2*i)-1;
            for (int j=0; j<stars; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half
        for (int i=n; i>0; i--){
            spaces = n-i;
            for (int j=0; j<spaces; j++){
                System.out.print("  ");
            }
            stars = (2*i)-1;
            for (int j=0; j<stars; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
