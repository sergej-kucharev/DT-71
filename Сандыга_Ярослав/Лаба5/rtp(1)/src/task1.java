
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class task1 {
    public task1() {
    }

    public static void result(Collection<Integer> var0, String var1) {
        for(int var2 = 0; var2 < 999; ++var2) {
            var0.add(var2);
        }

        long var14 = System.nanoTime();
        var0.add(9);
        long var4 = System.nanoTime() - var14;
        long var6 = System.nanoTime();
        var0.contains(5);
        long var8 = System.nanoTime() - var6;
        long var10 = System.nanoTime();
        var0.remove(2);
        long var12 = System.nanoTime() - var10;
        System.out.println("Adding time for " + var1 + " " + var4);
        System.out.println("Finding time for " + var1 + " " + var8);
        System.out.println("Removing time for " + var1 + " " + var12);
    }

    public static void main(String[] var0) {
        LinkedList var1 = new LinkedList();
        ArrayList var2 = new ArrayList();
        HashSet var3 = new HashSet();
        TreeSet var4 = new TreeSet();
        result(var1, "LinkedList");
        result(var2, "ArrayList");
        result(var3, "HashSet");
        result(var4, "TreeSet");
    }
}
