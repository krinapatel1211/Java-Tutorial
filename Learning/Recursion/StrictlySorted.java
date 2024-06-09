package Recursion;

public class StrictlySorted {

    public static boolean StrictlySortedArray(int[] arr, int index){
        if (index+1 == arr.length){
            return true;
        }
        if(arr[index]>=arr[index+1]){
            return false;
        }
        return StrictlySortedArray(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] ={1,2,2,3};
        System.out.println(StrictlySortedArray(arr, 0));

    }
}
