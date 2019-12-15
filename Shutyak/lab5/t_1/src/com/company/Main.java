package com.company;
import java.util.*;

public class Main {
    private static Random rand = new Random();
    private static <Collection extends AbstractCollection<Integer>> void fillElem(Collection collection) {
        int initialSize = 10000;
        for (int i = 0; i < initialSize; i++) collection.add(rand.nextInt());
    }

    private static <Collection extends AbstractCollection<Integer>> long addTime(Collection collection) {
        fillElem(collection);
        int checkNum = 1000;
        ArrayList<Integer> elementAdded = new ArrayList<>();
        for (int i = 0; i < checkNum; i++) {
            elementAdded.add(rand.nextInt());
        }
        long elementAddedT = System.nanoTime();
        collection.addAll(elementAdded);
        long averageT = (System.nanoTime() - elementAddedT) / checkNum;
        collection.clear();
        return averageT;
    }

    private static <Collection extends AbstractCollection<Integer>> Integer getElementByIndex(Collection collection, int ind) {
        Iterator<Integer> iterator = collection.iterator();
        for (int i = 0; i < ind; i++) iterator.next();
        return iterator.next();
    }

    private static <Collection extends AbstractCollection<Integer>> ArrayList<Integer> getRandomElements(Collection collection, int amount) {
        // measure time needed to append elements
        int size = collection.size();
        ArrayList<Integer> randomElements = new ArrayList<>();
        for (int i = 0; i < amount; i++) randomElements.add(getElementByIndex(collection, rand.nextInt(size)));
        return randomElements;
    }

    private static <Collection extends AbstractCollection<Integer>> long searchTime(Collection collection) {
        fillElem(collection);
        // measure time needed to remove elements
        int checkNum = 1000;
        ArrayList<Integer> elementsToSearch = getRandomElements(collection, checkNum);
        long totalTime = 0;
        for (Integer elemToSearch: elementsToSearch) {
            Iterator<Integer> iterator = collection.iterator();

            long elementAddedT = System.nanoTime();
            while (!elemToSearch.equals(iterator.next())) {}
            totalTime += System.nanoTime() - elementAddedT;
        }
        collection.clear();
        return totalTime / checkNum;
    }

    private static <Collection extends AbstractCollection<Integer>> long removeTime(Collection collection) {
        fillElem(collection);
        // measure time needed to remove elements
        int checkNum = 1000;
        ArrayList<Integer> elementsToRemove = getRandomElements(collection, checkNum);
        long elementAddedT = System.nanoTime();
        collection.removeAll(elementsToRemove);
        long averageT = (System.nanoTime() - elementAddedT) / checkNum;
        collection.clear();
        return averageT;
    }

    private static <Collection extends AbstractCollection<Integer>> void showTime(Collection collection) {
        System.out.println("===\n" + collection.getClass().getName() + ":");
        System.out.println("Add: " + addTime(collection) + " nanosec");
        System.out.println("Search: " + searchTime(collection) + " nanosec");
        System.out.println("Remove: " + removeTime(collection) + " nanosec");
    }


    public static void main(String[] args) {
        showTime(new LinkedList<>());
        showTime(new ArrayList<>());
        showTime(new TreeSet<>());
        showTime(new HashSet<>());
    }
}