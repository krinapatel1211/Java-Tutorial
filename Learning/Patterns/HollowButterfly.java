package Patterns;

public class HollowButterfly {
    public static void main(String[] args) {
        int n=5; int spaces=0;
        // Upper half
        for (int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print((j==0 || j==i-1) ? "*" : " ");
            }
            spaces = 2*(n-i);
            for(int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            for (int j=0; j<i; j++){    
                System.out.print((j==0 || j==i-1) ? "*" : " ");
            }
            System.out.println();
        }
        // lower half
        for (int i=n; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print((j==0 || j==i-1) ? "*" : " ");
            }
            spaces = 2*(n-i);
            for (int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            for (int j=0; j<i; j++){
                System.out.print((j==0 || j==i-1) ? "*" : " ");
            }
            System.out.println();
        }
    }
    
}
