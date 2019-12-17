package com.company;

import java.util.*;

public class Task1 {

    public static void Benchmark(Collection<Integer> collection) {
        var start = System.nanoTime();
        collection.add(37193);
        var end = System.nanoTime();
        System.out.printf("Time to add to %s: %d ns\n", collection.getClass().toString(), (end - start));

        start = System.nanoTime();
        collection.remove(37193);
        end = System.nanoTime();
        System.out.printf("Time to remove from %s: %d ns\n", collection.getClass().toString(), (end - start));

        start = System.nanoTime();
        collection.contains(37193);
        end = System.nanoTime();
        System.out.printf("Time to find from %s: %d ns\n", collection.getClass().toString(), (end - start));
    }

    public static void main(String[] args) {
        var list = new LinkedList<Integer>();
        var array = new ArrayList<Integer>();
        var set = new TreeSet<Integer>();
        var table = new HashSet<Integer>();

        for (int i = 0; i < 1e6; ++i) {
            list.add(i);
            array.add(i);
            set.add(i);
            table.add(i);
        }

        Benchmark(list);
        System.out.println();

        Benchmark(array);
        System.out.println();

        Benchmark(set);
        System.out.println();

        Benchmark(table);
        System.out.println();
    }
}
