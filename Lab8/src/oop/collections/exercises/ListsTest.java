package oop.collections.exercises;

import java.util.*;

public class ListsTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(3, 4, 5, 6, 7));
        Lists.insertFirst(list, 7);
        System.out.println(list);

        Lists.insertLast(list, 9);
        System.out.println(list);

        Lists.replace(list, 1);
        System.out.println(list);

        Lists.removeThird(list);
        Lists.removeEvil(list);
        System.out.println(list);

        System.out.println(Lists.generateSquare());

        System.out.println(Lists.contains(list, 3));

        ArrayList<Integer> newList = new ArrayList<Integer>(List.of(3, 9, 8, 5, 1));
        Lists.copy(list, newList);
        System.out.println(newList);

        Lists.reverse(list);
        System.out.println(list);

        Lists.reverseManual(list);
        System.out.println(list);

        LinkedList<Integer> linkedList = new LinkedList<Integer>(List.of(5, 6, 8, 9));
        Lists.insertBeginningEnd(linkedList, 10);
        System.out.println(linkedList);
    }
}
