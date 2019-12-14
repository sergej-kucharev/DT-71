package com.exam.dt6;

import java.util.*;

public class z1 {
    public static void result(String s, Collection col1,Collection col2)
    {
        System.out.println("Time for adding element in " +s+" : "+addObj(col1)+ " nanoseconds");
        System.out.println("Time for finding element in "+s+" : "+find(col1,col2)+ " nanoseconds");
        System.out.println("Time for removing element in "+s+" : "+remove(col1)+ " nanoseconds"+"\n\n");
    }
    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public static long addObj(Collection col)
    {
        long start, finish,tfe;
        start = System.nanoTime();
        col.addAll(col);
        finish = System.nanoTime();
        tfe = (finish-start)/col.size();
        return tfe;
    }
    public static long find(Collection col, Collection col2)
    {
        long start, finish, tfe=0;int k=0,i=0;
        Iterator it1 = col2.iterator();
        while(it1.hasNext())
        {
            if(col.contains(it1.next())!=true) it1.remove();

        }

        Iterator it2 = col2.iterator();
        start = System.nanoTime();
            while (it2.hasNext()) {
                if (col.contains(it2.next())) k++;
                i++;
            }
            if (k == 0) throw new ArithmeticException("No coincidence between collections");
        if(k==i) {
            finish = System.nanoTime();
            tfe = (finish-start)/i;
        }

       return tfe;
    }
    public static long remove(Collection col)
    {
        long start, finish,tfe;
        int size = col.size();
        start = System.nanoTime();
        col.removeAll(col);
        finish = System.nanoTime();
        tfe = (finish-start)/size;

        return tfe;
    }
    public static void main(String[] args)
    {
        LinkedList<Integer> li = new LinkedList<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>();

        ArrayList<Integer> ar = new ArrayList<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        TreeSet<Integer> tr = new TreeSet<Integer>();
        TreeSet<Integer> ts = new TreeSet<Integer>();
        HashSet<Integer> hh = new HashSet<Integer>();
        HashSet<Integer> hs = new HashSet<Integer>();


        for(int i = 0; i < 15000; i++)
        {
            li.add(getRandomNumberInRange(0,15000));
            ll.add(getRandomNumberInRange(0,15000));
        }
        ar.addAll(li);
        al.addAll(ll);
        tr.addAll(li);
        ts.addAll(ll);
        hh.addAll(li);
        hs.addAll(ll);
      result("Linked List", li,ll);

        result("Array List", ar, al);
        result("Tree Set",tr,ts);
        result("Hash Set",hh,hs);



    }
}
