import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public Task3() {
    }

    private static String getFileExtension(String var0) {
        int var1 = var0.indexOf(46);
        return var1 == -1 ? null : var0.substring(var1);
    }

    private static boolean checkType(String var0) {
        boolean var1 = false;
        String var2 = getFileExtension(var0);
        String var3 = ".txt";
        if (var3.equals(var2)) {
            var1 = true;
        }

        return var1;
    }

    private static void checkFormat(ArrayList<Employer> var0, String var1, String var2) throws IOException {
        Scanner var3 = new Scanner(new FileReader(var1));

        while(var3.hasNext()) {
            String var4 = var3.next();
            String var5 = var3.next();
            String var6 = var3.next();
            if (var2.equals("f")) {
                EmployerFixedPrice var7 = new EmployerFixedPrice(Integer.parseInt(var4), var5, (double)Integer.parseInt(var6));
                var0.add(var7);
            } else {
                EmployerHourPrice var8 = new EmployerHourPrice(Integer.parseInt(var4), var5, Integer.parseInt(var6));
                var0.add(var8);
            }
        }

    }

    private static void print(ArrayList<Employer> var0, String var1) {
        var0.sort(((var0x, var1x) -> {
            if (var0x.getSalary() == var1x.getSalary()) {
                return 0;
            } else {
                return var0x.getSalary() > var1x.getSalary() ? 1 : -1;
            }
        }).reversed().thenComparing(Employer::getName));
        System.out.println(var0.toString());
        System.out.println("a)List of names:");

        int var2;
        for(var2 = 0; var2 < 5; ++var2) {
            System.out.println(var2 + 1 + "." + ((Employer)var0.get(var2)).getName());
        }

        System.out.println("b)List of id:");

        for(var2 = var0.size() - 1; var2 > var0.size() - 4; --var2) {
            System.out.println(((Employer)var0.get(var2)).getId());
        }

        try {
            FileWriter var8 = new FileWriter(var1, false);

            try {
                var8.write(var0.toString());
                var8.flush();
            } catch (Throwable var6) {
                try {
                    var8.close();
                } catch (Throwable var5) {
                    var6.addSuppressed(var5);
                }

                throw var6;
            }

            var8.close();
        } catch (IOException var7) {
            System.out.println(var7.getMessage());
        }

    }

    public static void main(String[] var0) throws IOException {
        ArrayList var1 = new ArrayList();
        String var2 = "C:\\Users\\Acer\\Documents\\Testing\\MonthSalary.txt";
        String var3 = "C:\\Users\\Acer\\Documents\\Testing\\MonthSalaryHour.txt";
        String var4 = "C:\\Users\\Acer\\Documents\\Testing\\Result.txt";
        boolean var5 = Files.exists(Paths.get(var2), new LinkOption[0]);
        boolean var6 = Files.exists(Paths.get(var3), new LinkOption[0]);
        if (var5 && var6) {
            var5 = checkType(var2);
            var6 = checkType(var3);
        } else {
            System.out.println("File has incorrect format");
        }

        checkFormat(var1, var2, "f");
        checkFormat(var1, var3, "h");
        print(var1, var4);
    }
}
