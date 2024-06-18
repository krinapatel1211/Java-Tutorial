
public class XpowerN {
    /// Stack height == n
    // public static int calculateXpowerN(int x, int n){
    //     if (x ==0){
    //         return 0;
    //     }
    //     if (n==0){
    //         return 1;
    //     }
    //     int powerN = x * calculateXpowerN(x, n-1);
    //     return powerN;
    // }

    /// Stack height == log N ( this has logarithmic complexity)
    public static int calculateXpowerN(int x, int n){
        if (x ==0){
            return 0;
        }
        if (n==0){
            return 1;
        }
        if (n%2==0){
            return calculateXpowerN(x, n/2) * calculateXpowerN(x, n/2);
        }
        else{
            return calculateXpowerN(x, n/2) * calculateXpowerN(x, n/2) * x;
        }
    }

    public static void main(String[] args) {
        int x=2;
        int n=5;
        System.out.println(calculateXpowerN(x, n));
    }
}
