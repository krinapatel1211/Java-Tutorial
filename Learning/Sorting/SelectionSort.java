package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2,4};
        int smallest_index = 0;
        for (int i=0; i<arr.length-1; i++){
            smallest_index=i;
            for (int j=i; j<arr.length-1; j++){
                if(arr[smallest_index] > arr[j+1]){
                    smallest_index=j+1;
                }
            }
            int temp = arr[smallest_index];
            arr[smallest_index] = arr[i];
            arr[i]= temp;
        }
        for(int n: arr){
            System.out.print(n + ", ");
        }
    }
}
