package Recursion;

public class TowerOfHanoi {
    public static void printTowerofHanoi(int n, String source, String helper, String destination){
        if (n==1){
            System.out.println("transfer disck " + n + " from " + source + " to " + destination);
            return;
        }
        printTowerofHanoi(n-1, source, destination, helper);
        System.out.println("transfer disck " + n + " from " + source + " to " + destination);
        printTowerofHanoi(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        int n = 3;
        printTowerofHanoi(n, "S", "H", "D");

    }
}
