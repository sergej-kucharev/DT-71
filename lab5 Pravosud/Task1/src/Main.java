import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        int n = 1_000_000;
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
            linkedList.add(i);
            treeSet.add(i);
            hashSet.add(i);
        }
        long finish, start = System.currentTimeMillis();
        arrayList.remove(new Integer(1_000_000));
        finish = System.currentTimeMillis() - start;
        System.out.println("time to remove element form ArrayList = "
                + finish + " milliseconds");
        start = System.currentTimeMillis();
        linkedList.remove(new Integer(1_000_000));
        finish = System.currentTimeMillis() - start;
        System.out.println("time to remove element form LinkedList = "
                + finish + " milliseconds");
        start = System.currentTimeMillis();
        treeSet.remove(new Integer(1_000_000));
        finish = System.currentTimeMillis() - start;
        System.out.println("time to remove element form TreeSet = "
                + finish + " milliseconds");
        start = System.currentTimeMillis();
        hashSet.remove(new Integer(1_000_000));
        finish = System.currentTimeMillis() - start;
        System.out.println("time to remove element form HashSet = "
                + finish + " milliseconds");
        start = System.currentTimeMillis();
        arrayList.add(new Integer(1_000_000));
        finish = System.currentTimeMillis() - start;
        System.out.println("time to add element to ArrayList = "
                + finish + " milliseconds");
        start = System.currentTimeMillis();
        linkedList.add(new Integer(1_000_000));
        finish = System.currentTimeMillis() - start;
        System.out.println("time to add element to LinkedList = "
                + finish + " milliseconds");
        start = System.currentTimeMillis();
        treeSet.add(new Integer(1_000_000));
        finish = System.currentTimeMillis() - start;
        System.out.println("time to add element to TreeSet = "
                + finish + " milliseconds");
        start = System.currentTimeMillis();
        hashSet.add(new Integer(1_000_000));
        finish = System.currentTimeMillis() - start;
        System.out.println("time to add element to HashSet = "
                + finish + " milliseconds");
        start = System.currentTimeMillis();
        arrayList.contains(new Integer(1_000_000));
        finish = System.currentTimeMillis() - start;
        System.out.println("time to find element in ArrayList = "
                + finish + " milliseconds");
        start = System.currentTimeMillis();
        linkedList.contains(new Integer(1_000_000));
        finish = System.currentTimeMillis() - start;
        System.out.println("time to find element in LinkedList = "
                + finish + " milliseconds");
        start = System.currentTimeMillis();
        treeSet.contains(new Integer(1_000_000));
        finish = System.currentTimeMillis() - start;
        System.out.println("time to find element in TreeSet = "
                + finish + " milliseconds");
        start = System.currentTimeMillis();
        hashSet.contains(new Integer(1_000_000));
        finish = System.currentTimeMillis() - start;
        System.out.println("time to find element in HashSet = "
                + finish + " milliseconds");
    }
}
