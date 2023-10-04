package HashSet;

import java.util.*;

public class HashSet_Demo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(10);
        set.add(8);
        set.add(20);
        set.add(15);
        set.add(9);
        set.add(-11);
        set.add(-11);
        // does not contains duplicates
        System.out.println(set);
        // // contains
        // System.out.println(set.contains(4)); // true
        // System.out.println(set.contains(200)); // false
        // // remove
        // System.out.println(set.remove(-11));
        // System.out.println(set);
        // System.out.println(set.size());

        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(4);
        set1.add(10);
        set1.add(8);
        set1.add(20);
        set1.add(15);
        set1.add(9);
        set1.add(-11);
        set1.add(-11);
        System.out.println(set1);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(4);
        set2.add(10);
        set2.add(8);
        set2.add(20);
        set2.add(15);
        set2.add(9);
        set2.add(-11);
        set2.add(-11);
        System.out.println(set2);

        for (int i : set2) {
            System.out.print(i + " ");
        }

    }
}
