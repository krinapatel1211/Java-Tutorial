
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements 
        list.add(0);
        list.add(2);
        list.add(3);

        //print the list
        System.out.println(list);

        //get the element
        System.out.println(list.get(2));

        //add element in between
        list.add(1, 1);
        System.out.println(list);

        //change element at specific index
        list.set(0, 5);
        System.out.println(list);

        // remove element from specific index
        list.remove(0);
        System.out.println(list);

        //size of array list (use to iterate)
        System.out.println(list.size());

        // loop an array list
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        //sorting an array list
        list.add(9);
        list.add(6);
        list.add(5);
        Collections.sort(list);
        System.out.println(list);

        int arr[] = {1,2,3,50,20,6,7,30,3,8,10};
        Arrays.sort(arr);
        for(int n: arr)
        System.out.print(n+", ");
        System.out.println();
        System.out.println(Arrays.binarySearch(arr, 9)); //as not found
        System.out.println(Arrays.binarySearch(arr, 3));

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));


    }
}
