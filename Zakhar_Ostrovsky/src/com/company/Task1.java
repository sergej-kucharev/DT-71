//У ході виконання цього завдання було виміряно час додавання, пошуку й видалення об'єктів з колекцій  LinkedList, ArrayList, TreeSet, HashSet
//        на основі двох ріхних масивів: невпордякованого масиву, заповненого рандомними значеннями від 1 до 10000 та впорядкованого масиву.
//        Розмірність обох масивів склала 10000. Можна зробити такий висновок:
//        у середньому час додавання найкращий у LinkedList та ArrayList для обох типів масивів, а час пошуку та видалення найкращий у HashSet
//        (у загальному випадку, бо у випадку впорядкованого масиву TreeSet видає практично такі ж результати, що й HashSet).

package com.company;
import java.util.*;

class Measure {

    List<Integer> test;

    public Measure(List<Integer> test) {
        this.test = test;
    }

    public void measure(Collection<Integer> col) {
        long a = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            col.add(test.get(i));
        }
        long b = System.currentTimeMillis();
        System.out.println(b - a);
        for (int i = 0; i <= 10000; i++) {
            col.contains(test.get(i));
        }
        long c = System.currentTimeMillis();
        System.out.println(c - b);
        for (int i = 0; i <= 10000; i++) {
            col.remove(i);
        }
        long d = System.currentTimeMillis();
        System.out.println(d - c);
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("\n1st raw is time for adding elements, 2nd - for finding, " +
                "3d - for deleting (measured in ms)\n");
        List<Integer> testUnordered = new ArrayList<>();
        for (int i = 0; i <= 10000; i++) {
            testUnordered.add(1 + (int) (Math.random() * 10000));
        }
        List<Integer> testOrdered = new ArrayList<>();
        for (int i = 0; i <= 10000; i++) {
            testOrdered.add(i);
        }

        List<Integer> linked = new LinkedList<>();
        List<Integer> array = new ArrayList<>();
        Set<Integer> tree = new TreeSet<>();
        Set<Integer> hash = new HashSet<>();

        Measure Measure1 = new Measure(testUnordered);

        System.out.println("Results for an unordered list with random elements in range from 1 to 10000\n");
        System.out.println("LinkedList:");
        Measure1.measure(linked);
        System.out.println("ArrayList:");
        Measure1.measure(array);
        System.out.println("TreeSet:");
        Measure1.measure(tree);
        System.out.println("HashSet:");
        Measure1.measure(hash);

        Measure Measure2 = new Measure(testOrdered);

        System.out.println("-----------------------------------------------------------------------\n");

        System.out.println("Results for an ordered list with elements in range from 1 to 10000\n");
        System.out.println("LinkedList:");
        Measure2.measure(linked);
        System.out.println("ArrayList:");
        Measure2.measure(array);
        System.out.println("TreeSet:");
        Measure2.measure(tree);
        System.out.println("HashSet:");
        Measure2.measure(hash);
    }
}