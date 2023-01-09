package oop.collections.exercises;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i : first) {
            for (int j : second) {
                if (i == j) {
                    set.add(i);
                    break;
                }
            }
        }
        return set;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i : first) {
            set.add(i);
        }

        for (int j : second) {
            set.add(j);
        }
        return set;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> set = new HashSet<Integer>(first);
        set.retainAll(second);
        return set;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> set = new HashSet<Integer>(first);
        set.addAll(second);
        return set;
    }

    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        return new ArrayList<>(new HashSet<>(source));
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> result = new ArrayList<>();
        for (int i : source) {
            if (result.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static String firstRecurringCharacter(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }

        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            String result = s.charAt(i) + "";
            if (set.contains(result)) {
                return result;
            }
            set.add(result);
        }
        return null;
    }

    public static Set<Character> allRecurringCharacter(String s) {
        Set<Character> set = new HashSet<>();
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (set.contains(character)) {
                result.add(character);
            } else {
                set.add(character);
            }
        }
        return result;
    }

    public static Integer[] toArray(Set<Integer> source) {
        return source.toArray(new Integer[0]);
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }

}
