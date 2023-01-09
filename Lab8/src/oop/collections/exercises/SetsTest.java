package oop.collections.exercises;

import java.util.*;

public class SetsTest {
    public static void main(String[] args) {

        Set<Integer> first = new HashSet<>(List.of(2, 4, 6, 9));
        Set<Integer> second = new HashSet<>(List.of(4, 5, 9, 3));
        System.out.println(Sets.intersectionManual(first, second));
        System.out.println(Sets.unionManual(first, second));
        System.out.println(Sets.intersection(first, second));
        System.out.println(Sets.union(first, second));
        List<Integer> list = Sets.toList(first);

        System.out.println(list);
        System.out.println(Sets.removeDuplicates(list));
        System.out.println(Sets.removeDuplicatesManual(list));

        String str = "12345";
        System.out.println(Sets.firstRecurringCharacter(str));
        System.out.println(Sets.allRecurringCharacter(str));
        System.out.println(Sets.toArray(second));

        TreeSet<Integer> tree_set = new TreeSet<Integer>();
        System.out.println(Sets.getFirst(tree_set));
        System.out.println(Sets.getLast(tree_set));
        System.out.println(Sets.getGreater(tree_set, 4));

    }
}
