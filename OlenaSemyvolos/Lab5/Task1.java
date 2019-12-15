//Виміряти час додавання, пошуку і видалення об'єктів з колекцій  LinkedList, ArrayList, TreeSet, HashSet.
//Порівняти час і зробити висновок про те, за яких умов яка колекція працює швидше.

import java.util.*;

class Lab5 {
        public static void main(String[] args) {

        LinkedList<Integer> lin = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        TreeSet<Integer> tree = new TreeSet<>();
        HashSet<Integer> hash = new HashSet<>();
        int n = 100000, k = n;

        System.out.println("Time of operations in nanoseconds:");
        System.out.println("             |     Add       |    Search    |   Remove   ");
        System.out.println("-------------+---------------+--------------+-----------");
        System.out.println("Linked List  |\t" + Add(n, lin) + "\t |  " + Search(n, lin) + "\t   |  " + Remove(lin));
        System.out.println("Array List   |\t" + Add(n, arr) + "\t |  " + Search(n, arr) + "\t   |  " + Remove(arr));
        System.out.println("Treeset      |\t" + Add(n, tree) + "\t |  " + Search(n, tree) + "\t   |  " + Remove(tree));
        System.out.println("Hashset      |\t" + Add(n, hash) + "\t |  " + Search(n, hash) + "\t   |  " + Remove(hash));
    }


    private static long Add(int n, Collection<Integer> collection) {
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            collection.add(i);
        }
        long end = System.nanoTime();
        return  end - start;
    }

    private static long Search(int k, Collection<Integer> collection) {
        long start = System.nanoTime();
        collection.contains(k);
        long end = System.nanoTime();
        return  end - start;
    }

    private static long Remove(Collection<Integer> collection) {
        long start = System.nanoTime();
        for (int i = 0; i < collection.size(); i++) {
            collection.remove(i);
        }
        long end = System.nanoTime();
        return  end - start;
    }
}