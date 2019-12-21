package com.company; 

import java.util.*; 

public class Problem1 {

    public static void main(String[] args) {
        int n = 1000; 
        List < String > list = new LinkedList <>(); 
        double startTime = System.nanoTime(); 

        for(int i = 0; i < n; i++)
            list.add("spam"+i); 
        double timeSpent = (System.nanoTime() - startTime)/n; 
        System.out.println("time of adding element to LinkedList: " + timeSpent + " msec"); 

        startTime = System.nanoTime(); 


        if (list.contains(list.get(n/2)))
        {
            timeSpent = (System.nanoTime() - startTime); 
            System.out.println("time of searching for element at LinkedList: " + timeSpent + " msec"); 
        }

        startTime = System.nanoTime(); 

        for(int i = n-1; i >= 0; i--)
            list.remove(i); 
        timeSpent = (System.nanoTime() - startTime)/n; 
        System.out.println("time of removing one element from LinkedList: " + timeSpent + " msec"); 
        System.out.println(); 

        ArrayList < String > array_list = new ArrayList <>(); 
        startTime = System.nanoTime(); 
        for(int i = 0;  i < n; i++)
            array_list.add("spam"+i); 
        timeSpent = (System.nanoTime() - startTime)/n; 
        System.out.println("time of adding element to ArrayList: " + timeSpent + " msec"); 

        startTime = System.nanoTime(); 

        if (array_list.contains(array_list.get(n/2)))
        {
            timeSpent = (System.nanoTime() - startTime); 
            System.out.println("time of searching for element at ArrayList: " + timeSpent + " msec"); 
        }

        startTime = System.nanoTime(); 

        for(int i = n-1; i >= 0; i--)
            array_list.remove(i); 
        timeSpent = (System.nanoTime() - startTime)/n; 
        System.out.println("time of removing one element from ArrayList: " + timeSpent + " msec"); 
        System.out.println(); 

        TreeSet tree_set = new TreeSet(); 
        startTime = System.nanoTime(); 
        for(int i = 0;  i < n; i++)
            tree_set.add("spam"+i); 
        timeSpent = (System.nanoTime() - startTime)/n; 
        System.out.println("time of adding element to TreeSet: " + timeSpent + " msec"); 

        startTime = System.nanoTime(); 

        if (tree_set.contains("spam"+(int)(n/2)))
        {
            timeSpent = (System.nanoTime() - startTime); 
            System.out.println("time of searching for element at TreeSet: " + timeSpent + " msec"); 
        }


        startTime = System.nanoTime(); 
        for(int i = 0; i < n; i++)
            tree_set.remove("spam"+i); 
        timeSpent = (System.nanoTime() - startTime)/n; 
        System.out.println("time of removing one element from TreeSet: " + timeSpent + " msec"); 
        System.out.println(); 


        HashSet hash_set = new HashSet(); 
        startTime = System.nanoTime(); 
        for(int i = 0; i < n; i++)
            hash_set.add("spam"+i); 
        timeSpent = (System.nanoTime() - startTime)/n; 
        System.out.println("time of adding element to HashSet: " + timeSpent + " msec"); 

        startTime = System.nanoTime(); 

        if (hash_set.contains("spam"+(int)(n/2)))
        {
            timeSpent = (System.nanoTime() - startTime); 
            System.out.println("time of searching for element at HashSet: " + timeSpent + " msec"); 
        }

        startTime = System.nanoTime(); 

        for(int i = n-1; i >= 0; i--)
            hash_set.remove(i); 
        timeSpent = (System.nanoTime() - startTime)/n; 
        System.out.println("time of removing one element from HashSet: " + timeSpent + " msec"); 
    }
}
