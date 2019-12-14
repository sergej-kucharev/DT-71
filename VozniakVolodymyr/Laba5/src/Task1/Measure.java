package Task1;
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