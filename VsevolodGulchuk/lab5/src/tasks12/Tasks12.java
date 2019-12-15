package tasks12;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Tasks12 {
    public static void task1(){
        System.out.println("TASK1");
        long n = (long) 1E4;
        ArrayList arrayList= new ArrayList();
        LinkedList linkedList = new LinkedList();
        TreeSet treeSet = new TreeSet();
        HashSet hashSet = new HashSet();

        //LinkedList:

        //Adding elements
        long milis = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
        {
            linkedList.add(Integer.toString((int)(Math.random()*1000)));
        }
        long addingLinkedList = System.currentTimeMillis() - milis;

        //Searching:
        milis = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
        {
            linkedList.contains(Integer.toString((int)(Math.random()*1000)));
        }
        long searchingLinkedList = System.currentTimeMillis() - milis;

        //Removing:
        milis = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
        {
            linkedList.remove(Integer.toString((int)(Math.random()*1000)));
        }
        long removingLinkedList = System.currentTimeMillis() - milis;

        //ArrayList:

        //Adding elements
        milis = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
        {
            arrayList.add(Integer.toString((int)(Math.random()*1000)));
        }
        long addingArrayList = System.currentTimeMillis() - milis;

        //Searching:
        milis = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
        {
            arrayList.contains(Integer.toString((int)(Math.random()*1000)));
        }
        long searchingArrayList = System.currentTimeMillis() - milis;

        //Removing:
        milis = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
        {
            arrayList.remove(Integer.toString((int)(Math.random()*1000)));
        }
        long removingArrayList = System.currentTimeMillis() - milis;


        //TreeSet:

        //Adding elements
        milis = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
        {
            treeSet.add(Integer.toString((int)(Math.random()*1000)));
        }
        long addingTreeSet = System.currentTimeMillis() - milis;

        //Searching:
        milis = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
        {
            treeSet.contains(Integer.toString((int)(Math.random()*1000)));
        }
        long searchingTreeSet = System.currentTimeMillis() - milis;

        //Removing:
        milis = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
        {
            treeSet.remove(Integer.toString((int)(Math.random()*1000)));
        }
        long removingTreeSet = System.currentTimeMillis() - milis;

        //HashSet:

        //Adding elements
        milis = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
        {
            hashSet.add(Integer.toString((int)(Math.random()*1000)));
        }
        long addingHashSet = System.currentTimeMillis() - milis;

        //Searching:
        milis = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
        {
            hashSet.contains(Integer.toString((int)(Math.random()*1000)));
        }
        long searchingHashSet = System.currentTimeMillis() - milis;

        //Removing:
        milis = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
        {
            hashSet.remove(Integer.toString((int)(Math.random()*1000)));
        }
        long removingHashSet = System.currentTimeMillis() - milis;



        System.out.println(
                "Adding:\n" +
                        "\tLinkedList:\t" + addingLinkedList + "\tms\n" +
                        "\tArrayList: \t" + addingArrayList + "\tms\n" +
                        "\tTreeSet: \t" + addingTreeSet + "\tms\n" +
                        "\tHashSet: \t" + addingHashSet + " \tms");
        System.out.println(
                "Searching:\n" +
                        "\tLinkedList:\t" + searchingLinkedList + "\tms\n" +
                        "\tArrayList: \t" + searchingArrayList + "\tms\n" +
                        "\tTreeSet: \t" + searchingTreeSet + " \tms\n" +
                        "\tHashSet: \t" + searchingHashSet + "\tms");
        System.out.println(
                "Removing:\n" +
                        "\tLinkedList:\t" + removingLinkedList + "\tms\n" +
                        "\tArrayList: \t" + removingArrayList + "\tms\n" +
                        "\tTreeSet: \t" + removingTreeSet + "\tms\n" +
                        "\tHashSet: \t" + removingHashSet + "\tms");
        System.out.println("End of TASK1");
    }
    public static void task2()
    {
        System.out.println("TASK2");
        LinkedList<String> alpha = new LinkedList();
        int n = 150;
        int b = 15;
        int maxRand = 200;
        for (int i = 0; i < n; i++)
        {
            alpha.add(inStr(rand(maxRand)));
        }
        LinkedList<String> beta = new LinkedList();
        for (int i=0; i<b; i++)
        {
            beta.add(inStr(0));
        }
        for (int i=0; i < n; i++) {
            for (int j=0; j < 15; j++)
            {
                if(inInt(alpha.get(i)) > inInt(beta.get(j)))
                {
                    beta.set(j, alpha.get(i));
                    break;
                }
            }
        }
        String outString = "Beta: ";
        for (int i=0; i < b; i++)
        {
            outString += (beta.get(i) + " ");
        }
        System.out.println(outString);
        try {
            String curDir = System.getProperty("user.dir");
            String fileName = curDir + "/src/tasks12/files/task2Output.txt";
            File file = new File(fileName);
            PrintWriter output = new PrintWriter(file);
            output.println(outString);
            output.close();
        }
        catch (IOException ex)
        {
            System.out.printf("ERROR: %s\n",  ex);
        }

        System.out.println("End of TASK2");
    }
    public static int rand(int i){ return (int)(Math.random()*i); }
    public static String inStr(int i) { return Integer.toString(i); }
    public static int inInt(String s) { return Integer.parseInt(s); }
}
