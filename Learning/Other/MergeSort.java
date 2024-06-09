package Other;
public class MergeSort {
    public static void conquer(int arr[], int si, int mid, int ei){
        int merged[]= new int[ei-si+1];
        int indx1 = si;
        int indx2 = mid+1;
        d

    }   
    public static void divide(int arr[], int si, int ei){
        if (si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;

        // int si=0; int ei=n-1;
        // int mid = si + (ei-si)/2;
        // divide
    }
}
