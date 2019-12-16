package Task1;
import java.util.*;

public class task1 {
    private static Random random = new Random();

    private static int initialSize = 100;

    private static int checkAmount = 10;

    private static void linkedlist(){
        LinkedList<Integer> object=new LinkedList<Integer>();
        for (int i = 0; i < initialSize; i++)
            object.add(random.nextInt(1000));
         ArrayList<Integer> elementsToAdd = new ArrayList<>();
         for (int i = 0; i < checkAmount; i++)
            elementsToAdd.add(random.nextInt(1000));
         //add
        long startTime = System.nanoTime();
        object.addAll(elementsToAdd);
        long addTime = (System.nanoTime() - startTime) / checkAmount;
        //search
        startTime = System.nanoTime();
        object.contains(666);
        long searchTime = (System.nanoTime() - startTime);
        //remove
        startTime = System.nanoTime();
        object.remove(66);
        long removeTime = (System.nanoTime() - startTime);
        System.out.println("LinkedList: ");
        System.out.println("\tAdding time: " + addTime);
        System.out.println("\tSearch time: " + searchTime);
        System.out.println("\tRemoval time: " + removeTime);
    }
    private static void arraylist(){
        ArrayList<Integer> object=new ArrayList<Integer>();
        for (int i = 0; i < initialSize; i++)
            object.add(random.nextInt(1000));
        ArrayList<Integer> elementsToAdd = new ArrayList<>();
        for (int i = 0; i < checkAmount; i++)
            elementsToAdd.add(random.nextInt(1000));
        //add
        long startTime = System.nanoTime();
        object.addAll(elementsToAdd);
        long addTime = (System.nanoTime() - startTime) / checkAmount;
        //search
        startTime = System.nanoTime();
        object.contains(666);
        long searchTime = (System.nanoTime() - startTime);
        //remove
        startTime = System.nanoTime();
        object.remove(66);
        long removeTime = (System.nanoTime() - startTime);
        System.out.println("ArrayList: ");
        System.out.println("\tAdding time: " + addTime);
        System.out.println("\tSearch time: " + searchTime);
        System.out.println("\tRemoval time: " + removeTime);
    }
    private static void treeset() {
        TreeSet<Integer> object = new TreeSet<Integer>();
        for (int i = 0; i < initialSize; i++)
            object.add(random.nextInt(1000));
        ArrayList<Integer> elementsToAdd = new ArrayList<>();
        for (int i = 0; i < checkAmount; i++)
            elementsToAdd.add(random.nextInt(1000));
        //add
        long startTime = System.nanoTime();
        object.addAll(elementsToAdd);
        long addTime = (System.nanoTime() - startTime) / checkAmount;
        //search

        startTime = System.nanoTime();
        object.contains(666);
        long searchTime = (System.nanoTime() - startTime);
        //remove
        startTime = System.nanoTime();
        object.remove(66);
        long removeTime = (System.nanoTime() - startTime);
        System.out.println("TreeSet: ");
        System.out.println("\tAdding time: " + addTime);
        System.out.println("\tSearch time: " + searchTime);
        System.out.println("\tRemoval time: " + removeTime);
    }
    private static void hashset() {
        HashSet<Integer> object = new HashSet<Integer>();
        for (int i = 0; i < initialSize; i++)
            object.add(random.nextInt(1000));
        ArrayList<Integer> elementsToAdd = new ArrayList<>();
        for (int i = 0; i < checkAmount; i++)
            elementsToAdd.add(random.nextInt(1000));
        //add
        long startTime = System.nanoTime();
        object.addAll(elementsToAdd);
        long addTime = (System.nanoTime() - startTime) / checkAmount;
        //search

        startTime = System.nanoTime();
        object.contains(666);
        long searchTime = (System.nanoTime() - startTime);
        //remove
        startTime = System.nanoTime();
        object.remove(66);
        long removeTime = (System.nanoTime() - startTime);
        System.out.println("HashSet: ");
        System.out.println("\tAdding time: " + addTime);
        System.out.println("\tSearch time: " + searchTime);
        System.out.println("\tRemoval time: " + removeTime);
    }
    public static void main() {
            linkedlist();
            arraylist();
            treeset();
            hashset();
    }
}

