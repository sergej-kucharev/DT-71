package lab5;

import java.util.*;

public class Task1 {
    private static Random random = new Random();

    private static void Add(Collection collection) {
        int measureSize = 10000;
        for (int i = 0; i < measureSize; i++) {
            collection.add(random.nextInt());
        }
    }

    private static ArrayList<Integer> Find(Collection collection) {
        int measureSize = 1000;
        HashSet<Integer> index = new HashSet<Integer>();
        while (index.size() < measureSize) {
            index.add(random.nextInt(collection.size()));
        }
        ArrayList<Integer> findingValues = new ArrayList<Integer>();
        for (Iterator<Integer> it = index.iterator(); it.hasNext(); ) {
            findingValues.add((int)collection.toArray()[it.next()]);
        }
        return findingValues;
    }

    private static void MeasureTime(Collection collection) {
        long start = System.nanoTime();
        Add(collection);
        long finish = System.nanoTime();
        long addTime = (finish - start) / collection.size();
        System.out.println("Time of addition: " + addTime);

        ArrayList<Integer> findingValues = Find(collection);
        start = System.nanoTime();
        for(int i = 0; i < findingValues.size(); i++) {
            collection.contains(findingValues.get(i));
        }
        finish = System.nanoTime();
        long findTime = (finish - start) / findingValues.size();
        System.out.println("Time of searching: " + findTime);

        start = System.nanoTime();
        collection.removeAll(findingValues);
        finish = System.nanoTime();
        long deleteTime = (finish - start) / findingValues.size();
        System.out.println("Time of removal: " + deleteTime);
    }

    public static void Task() {
        System.out.println("ArrayList");
        MeasureTime(new ArrayList());
        System.out.println("LinkedList");
        MeasureTime(new LinkedList());
        System.out.println("HashSet");
        MeasureTime(new HashSet());
        System.out.println("TreeSet");
        MeasureTime(new TreeSet());
    }
}
