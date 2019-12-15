package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        String n1,n2,n3= null;
        boolean n4= true;
        long start, finish;
        list.add("element1");
        start = System.nanoTime();
        list.add("element2");
        finish = System.nanoTime();
        long result11= finish - start;
        list.add("element3");
        start = System.nanoTime();
        list.remove(2);
        finish = System.nanoTime();
        long result12 = finish - start;
        start = System.nanoTime();
        n1=list.get(1);
        finish = System.nanoTime();
        long result13 = finish - start;


        ArrayList<String> array = new ArrayList<>();
        array.add("element1");
        start = System.nanoTime();
        array.add("element2");
        finish = System.nanoTime();
        long result21 = finish - start;
        array.add("element3");
        start = System.nanoTime();
        array.remove(2);
        finish = System.nanoTime();
        long result22 = finish - start;
        start = System.nanoTime();
        n2=array.get(1);
        finish = System.nanoTime();
        long result23 = finish - start;


        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("element1");
        start = System.nanoTime();
        treeSet.add("element2");
        finish = System.nanoTime();
        long result31 = finish - start;
        treeSet.add("element3");
        start = System.nanoTime();
        treeSet.remove("element3");
        finish = System.nanoTime();
        long result32 = finish - start;
        start = System.nanoTime();
        n3=treeSet.first();
        finish = System.nanoTime();
        long result33 = finish - start;

        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("element1");
        start = System.nanoTime();
        hashSet.add("element2");
        finish = System.nanoTime();
        long result41 = finish - start;
        hashSet.add("element3");
        start = System.nanoTime();
        hashSet.remove("element3");
        finish = System.nanoTime();
        long result42 = finish - start;
        start = System.nanoTime();
        n4=hashSet.contains("element1");
        finish = System.nanoTime();
        long result43 = finish - start;

        System.out.println("Додавання елементу:     Linked list  " +result11+ " Array List  " +result21+  " Treeset  " +result31+ " HashSet " +result41  );
        System.out.println("Видалення елементу:     Linked list  " +result12+ " Array List  " +result22+  " Treeset  " +result32+ " HashSet " +result42  );
        System.out.println("Знаходження елементу:   Linked list  " +result13+ " Array List  " +result23+  " Treeset  " +result33+ " HashSet " +result43  );
    }
}


