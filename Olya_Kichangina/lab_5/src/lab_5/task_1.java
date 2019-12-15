package lab_5;
import java.util.*;

public class task_1 {
    private static long add_time(Collection<Integer> c, Integer a) {
        long time = System.nanoTime();
        c.add(a);
        time = System.nanoTime() - time;
        return time;
    }

    private static long search_time(Collection<Integer> c, Integer a) {
    	long time = System.nanoTime();
        c.contains(a);
        time = System.nanoTime() - time;
        return time;
    }

    private static long remove_time(Collection<Integer> c, Integer a) {
    	long time = System.nanoTime();
        c.remove(a);
        time = System.nanoTime() - time;
        return time;
    }
    
    private static void print_add_time(Collection<Integer> c, List<Long> l, String s) {
    	for(int i=0; i<100000; i++) {
            l.add(add_time(c, i));
        }
        System.out.println(s + " " + l.stream().mapToLong(val -> val).average().orElse(0) + " ns.");

    }
    
    private static void print_search_time(Collection<Integer> c, List<Long> l, String s) {
    	for(int i=0; i<100000; i++) {
            l.add(search_time(c, i));
        }
        System.out.println(s + " " + l.stream().mapToLong(val -> val).average().orElse(0) + " ns.");

    }
    
    private static void print_remove_time(Collection<Integer> c, List<Long> l, String s) {
    	for(int i=0; i<100000; i++) {
            l.add(remove_time(c, i));
        }
        System.out.println(s + " " + l.stream().mapToLong(val -> val).average().orElse(0) + " ns.");

    }

    public static void main(String args[]) {
    	ArrayList<Integer> array = new ArrayList<>();
        LinkedList<Integer> link = new LinkedList<>();
        HashSet<Integer> hash = new HashSet<>();
        TreeSet<Integer> tree = new TreeSet<>();
        List<Long> time_add = new ArrayList<>();
        List<Long> time_search = new ArrayList<>();
        List<Long> time_remove = new ArrayList<>();
        String s1 = "ArrayList";
        String s2 = "LinkedList";
        String s3 = "HashSet";
        String s4 = "TreeSet";
        System.out.println("Add time for:");
        print_add_time(array,time_add,s1);
        time_add.clear();
        print_add_time(link,time_add,s2);
        time_add.clear();
        print_add_time(hash,time_add,s3);
        time_add.clear();
        print_add_time(tree,time_add,s4);
        time_add.clear();
        System.out.println("Search time for:");
        print_search_time(array,time_search,s1);
        time_search.clear();
        print_search_time(link,time_search,s2);
        time_search.clear();
        print_search_time(hash,time_search,s3);
        time_search.clear();
        print_search_time(tree,time_search,s4);
        time_search.clear();
        System.out.println("Remove time for:");
        print_remove_time(array,time_remove,s1);
        time_remove.clear();
        print_remove_time(link,time_remove,s2);
        time_remove.clear();
        print_remove_time(hash,time_remove,s3);
        time_remove.clear();
        print_remove_time(tree,time_remove,s4);
        time_remove.clear();
  
    }
}
