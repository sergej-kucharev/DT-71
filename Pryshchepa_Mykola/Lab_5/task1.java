import java.util.*;
import java.time.*;

public class task1 {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        LinkedList<Integer> link_list = new LinkedList<Integer>();
        Set<Integer> tree_set = new TreeSet<Integer>();
        Set<Integer> hash_set = new HashSet<Integer>();
        System.out.println("ArrayList:");
        res(list);
        System.out.println("LinkedList:");
        res(link_list);
        System.out.println("TreeSet:");
        res(tree_set);
        System.out.println("HashSet:");
        res(hash_set);
    }
    static void res(ArrayList<Integer> a){
        long start = System.currentTimeMillis();
        for(int i=0; i<1000000; i++){
            a.add(i);
        }

        long end =  System.currentTimeMillis()-start;
        System.out.println("Час створення: "+end);
        start = System.currentTimeMillis();
        a.indexOf(700000);
        end=  System.currentTimeMillis()-start;
        System.out.println("Час пошуку"+end);
        start = System.currentTimeMillis();
        a.clear();
        end=  System.currentTimeMillis()-start;
        System.out.println("Час видалення"+end);

    }

    static void res(LinkedList<Integer> a){
        long start = System.currentTimeMillis();
        for(int i=0; i<1000000; i++){
            a.add(i);
        }

        long end =  System.currentTimeMillis()-start;
        System.out.println("Час створення: "+end);
        start = System.currentTimeMillis();
        a.indexOf(700000);
        end=  System.currentTimeMillis()-start;
        System.out.println("Час пошуку"+end);
        start = System.currentTimeMillis();
        a.clear();
        end=  System.currentTimeMillis()-start;
        System.out.println("Час видалення"+end);

    }

    static void res(Set<Integer> a){
        long start = System.currentTimeMillis();
        for(int i=0; i<1000000; i++){
            a.add(i);
        }

        long end =  System.currentTimeMillis()-start;
        System.out.println("Час створення: "+end);
        start = System.currentTimeMillis();
        boolean r=a.contains(700000);
        end=  System.currentTimeMillis()-start;
        System.out.println("Час пошуку"+end);
        start = System.currentTimeMillis();
        a.clear();
        end=  System.currentTimeMillis()-start;
        System.out.println("Час видалення"+end);

    }

}
