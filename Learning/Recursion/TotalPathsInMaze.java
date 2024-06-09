package Recursion;

public class TotalPathsInMaze {
    public static int countPaths(int i, int j, int n, int m){
        
        if (i==n || j==m){
            return 0;
        }
        if (i==n-1 || j==m-1){
            return 1;
        }
        // move downwards
        int downwards = countPaths(i+1, j, n, m);

        int moveRight = countPaths(i, j+1, n, m);

        return (downwards+moveRight);
    }
    public static void main(String[] args) {
        int n=2; int m =3;
        System.out.println(countPaths(0, 0, n, m));
    }
}
