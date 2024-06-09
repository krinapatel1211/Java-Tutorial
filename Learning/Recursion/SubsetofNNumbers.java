package Recursion;

import java.util.ArrayList;

public class SubsetofNNumbers {

    public static void printSubsets(int n, ArrayList<Integer> subset){

        if (n==0){
            for (int i=0; i<subset.size(); i++){
                System.out.print(subset.get(i) + " ");
            }
            System.out.println();
            return;
        }
        //either add in seubset
        subset.add(n);
        printSubsets(n-1, subset);

        //Do not get added to subset
        subset.remove(subset.size()-1);
        printSubsets(n-1, subset);
    }
    public static void main(String[] args) {
        int n = 4;
        ArrayList<Integer> subsets = new ArrayList<>();
        printSubsets(n, subsets);

    }
}
