package Recursion;

public class PlaceTilesonFloor {
    public static int placeTiles(int n, int m){
        if (n==m){
            return 2;
        }
        if (n<m){
            return 1;
        }
        //PLACE VERTICAL
        int verticalPlacement = placeTiles(n-m, m);

        //PLACE HORIZONTAL
        int horizontalPlacement = placeTiles(n-1, m);
        return (verticalPlacement + horizontalPlacement);
    }
    public static void main(String[] args) {
        int n = 4; int m=2;
        System.out.println(placeTiles(n,m));

    }
}
