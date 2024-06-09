package Recursion;

public class InviteNPeople {

    public static int callGuest(int n){
        if (n<=1){
            return 1;
        }
        // single guest calls
        int singleguests = callGuest(n-1);

        //pair guest calls
        int pairguests = (n-1) * callGuest(n-2);
        return (singleguests+pairguests);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(callGuest(n));
    }
}
