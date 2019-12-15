import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Task2 {
    public Task2() {
    }

    public static void main(String[] var0) throws IOException {
        ArrayList var1 = new ArrayList(150);
        File var2 = new File("C:\\Users\\User\\IdeaProjects\\rtp(2)\\Task2.txt");
        FileOutputStream var3 = new FileOutputStream(var2);
        OutputStreamWriter var4 = new OutputStreamWriter(var3);
        System.out.println("Collection alpha:");

        int var6;
        for(int var5 = 0; var5 < 150; ++var5) {
            var6 = 1 + (int)(Math.random() * 200.0D);
            var1.add(var6);
            PrintStream var10000 = System.out;
            Object var10001 = var1.get(var5);
            var10000.print(var10001 + " ");
        }

        System.out.print("\n");
        TreeSet var9 = new TreeSet();
        var9.addAll(var1);
        var6 = var9.size() - 15;
        Iterator var7 = var9.iterator();

        for(int var8 = 0; var8 < var6; ++var8) {
            var7.next();
            var7.remove();
        }

        System.out.println("Collection beta:");

        while(var7.hasNext()) {
            System.out.print(((Integer)var7.next()).toString() + " ");
        }

        var4.write("Collection alpha:\n");
        var4.write(var1.toString());
        var4.write("\nCollection beta:\n");
        var4.write(var9.toString());
        var4.close();
    }
}
