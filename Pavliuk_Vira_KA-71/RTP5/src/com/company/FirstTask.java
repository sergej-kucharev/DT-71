package com.company;

import java.util.*;

public class FirstTask {
    public static void FirstTask(){
        LinkedList<String> lnlist=new LinkedList<String>();
        ArrayList<String> arlist=new ArrayList<String>();
        TreeSet<String> tset=new TreeSet<String>();
        HashSet<String> hset=new HashSet<String>();
        long lnlist_time = 0, arlist_time = 0,tset_time = 0, hset_time = 0;
        lnlist_time=TimeAdd(lnlist, "LinkedList");
        arlist_time=TimeAdd(arlist, "ArrayList");
        tset_time=TimeAdd(tset, "TreeSet");
        hset_time=TimeAdd(hset,"HashSet");
        Compare(lnlist_time, arlist_time, tset_time, hset_time);

        lnlist_time=TimeFind(lnlist,"LinkedList");
        arlist_time=TimeFind(arlist,"ArrayList");
        tset_time=TimeFind(tset,"TreeSet");
        hset_time=TimeFind(hset,"HashSet");
        Compare(lnlist_time, arlist_time, tset_time, hset_time);

        lnlist_time=TimeRemove(lnlist,"LinkedList");
        arlist_time=TimeRemove(arlist,"ArrayList");
        tset_time=TimeRemove(tset,"TreeSet");
        hset_time=TimeRemove(hset,"HashSet");
        Compare(lnlist_time, arlist_time, tset_time, hset_time);
    }
    public static long TimeAdd(Collection c, String s){
        String a = "abbba";
        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            c.add(a+i);
        }
        long elapsedTime = System.nanoTime() - start;
        System.out.println("Time of adding element to " + s + " " + (elapsedTime));
        return (elapsedTime);
    }
    public static long TimeFind(Collection c, String s){
        int k = 0;
        String a = "abbba";
        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            if (c.contains(a+i)) k++;
        }
        long elapsedTime = System.nanoTime() - start;
        System.out.println("Time of finding element to " + s + " " + (elapsedTime));
        return (elapsedTime);
    }
    public static long TimeRemove(Collection c, String s){
        int k = 0;
        String a = "abbba";
        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            if (c.remove(a+i)) k++;
        }
        long elapsedTime = System.nanoTime() - start;
        System.out.println("Time of removing element to " + s + " " + (elapsedTime));
        return (elapsedTime);
    }
    public static void Compare(long a, long b, long c, long d){
        long max = Long.MAX_VALUE;
        Dictionary<String, Long> results = new Hashtable();
        results.put("LinkedList", a);
        results.put("ArrayList", b);
        results.put("TreeSet", c);
        results.put("HashSet", d);
        String resultString = "";

        for ( Map.Entry<String, Long> entry : ((Hashtable<String, Long>) results).entrySet() ) {
            String key = entry.getKey();
            long value = entry.getValue();
            if (value < max) {
                resultString = key;
                max = value;
            }
            else if (value == max){
                resultString = resultString + " and " + key;
            }
        }
        System.out.println("Fastest collection - "+resultString);
    }
}
