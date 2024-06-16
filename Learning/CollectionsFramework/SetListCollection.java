import java.util.LinkedHashSet;
import java.util.TreeSet;
public class SetListCollection {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(25);
        System.out.println(set);

        TreeSet<Integer> tset = new TreeSet<Integer>();
        tset.add(10);
        tset.add(20);
        tset.add(30);
        tset.add(25);       
        System.out.println(tset);

    }
}
