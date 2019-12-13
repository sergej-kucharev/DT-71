
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;



public class task1 {

    public static void list(long n, String s){
        long startTime = System.currentTimeMillis();
        System.out.println( "LinkedList");
        LinkedList<String> myList = new LinkedList<String>();

        for( long i = 0; i < n; i++ ){
            myList.add(Long.toString(i));
        }
        //System.out.println("LinkedList:" + myList);
        System.out.print( "Add time (mls) ");
        System.out.println(System.currentTimeMillis()-startTime);
        startTime = System.currentTimeMillis();
        System.out.print( "Search time (mls) ");
        if( myList.contains(s))
        {
            System.out.println(System.currentTimeMillis()-startTime);
        }
        else{
            System.out.println(" List dosen't contain elemet 99999, please choose another" );
        }
        startTime = System.currentTimeMillis();
        System.out.print( "Remove time (mls) ");
        for( long i = 0; i < n; i++ ){
            myList.remove(Long.toString(i));
        }
        System.out.println(System.currentTimeMillis()-startTime + "\n");
    }

    private static void arraylist(long n, String s) {
        long startTime = System.currentTimeMillis();
        System.out.println( "ArrayList");
        ArrayList<String> myList = new ArrayList<String>();
        for( long i = 0; i < n; i++ ){
            myList.add(Long.toString(i));
        }
        //System.out.println("ArrayList:" + myList);
        System.out.print( "Add time (mls) ");
        System.out.println(System.currentTimeMillis()-startTime);
        startTime = System.currentTimeMillis();
        System.out.print( "Search time (mls) ");
        if( myList.contains(s))
        {
            System.out.println(System.currentTimeMillis()-startTime);
        }
        else{
            System.out.println(" List dosen't contain elemet 99999, please choose another" );
        }
        startTime = System.currentTimeMillis();
        System.out.print( "Remove time (mls) ");
        for( long i = 0; i < n; i++ ){
            myList.remove(Long.toString(i));
        }
        System.out.println(System.currentTimeMillis()-startTime + "\n");
    }
    private static void tree(long n, String s) {
        long startTime = System.currentTimeMillis();
        System.out.println( "TreeSet");
        TreeSet<String> myList = new TreeSet<String>();

        for( long i = 0; i < n; i++ ){
            myList.add(Long.toString(i));
        }
        //System.out.println("ArrayList:" + myList);
        System.out.print( "Add time (mls) ");
        System.out.println(System.currentTimeMillis()-startTime);
        startTime = System.currentTimeMillis();
        System.out.print( "Search time (mls) ");
        if( myList.contains(s))
        {
            System.out.println(System.currentTimeMillis()-startTime);
        }
        else{
            System.out.println(" List dosen't contain elemet 99999, please choose another" );
        }
        startTime = System.currentTimeMillis();
        System.out.print( "Remove time (mls) ");
        for( long i = 0; i < n; i++ ){
            myList.remove(Long.toString(i));
        }
        System.out.println(System.currentTimeMillis()-startTime + "\n");
    }
    private static void hash(long n, String s) {
        long startTime = System.currentTimeMillis();
        System.out.println( "HashSet");
        HashSet<String> myList = new HashSet<String>();

        for( long i = 0; i < n; i++ ){
            myList.add(Long.toString(i));
        }
        //System.out.println("ArrayList:" + myList);
        System.out.print( "Add time (mls) ");
        System.out.println(System.currentTimeMillis()-startTime);
        startTime = System.currentTimeMillis();
        System.out.print( "Search time (mls) ");
        if( myList.contains(s))
        {
            System.out.println(System.currentTimeMillis()-startTime);
        }
        else{
            System.out.println(" List dosen't contain elemet 99999, please choose another" );
        }
        startTime = System.currentTimeMillis();
        System.out.print( "Remove time (mls) ");
        for( long i = 0; i < n; i++ ){
            myList.remove(Long.toString(i));
        }
        System.out.println(System.currentTimeMillis()-startTime + "\n");
    }


    public static void main(String[] args) {

        int n = 100000;
        String  s= "90000";
        list(n, s);
        arraylist(n,s);
        tree(n,s);
        hash(n,s);
    }
}
