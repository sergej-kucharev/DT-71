import java.util.*;

public class Task1 {
    public static void main (String[] args){
        LinkedList ll = new LinkedList();
        ArrayList  al = new ArrayList();
        TreeSet ts = new TreeSet();
        HashSet  hs = new HashSet();
        Date startLinked = new Date();
        for(int i = 0; i < 1000000; i++) {
            ll.add(i);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();
        System.out.print("add 1kk elements LinkedList: ");
        System.out.println(linkedTime);


        Date startLinked1 = new Date();
        for(int i = 0; i < 1000000; i++) {
            al.add(i);
        }
        Date finishLinked1 = new Date();
        long linkedTime1 = finishLinked1.getTime() - startLinked1.getTime();
        System.out.print("add 1kk elements ArrayList: ");
        System.out.println(linkedTime1);

        Date startLinked7 = new Date();
        for(int i = 0; i < 1000000; i++) {
            ts.add(i);
        }
        Date finishLinked7 = new Date();
        long linkedTime7 = finishLinked7.getTime() - startLinked7.getTime();
        System.out.print("add 1kk elements TreeSet: ");
        System.out.println(linkedTime7);

        Date startLinked8 = new Date();
        for(int i = 0; i < 1000000; i++) {
            hs.add(i);
        }
        Date finishLinked8 = new Date();
        long linkedTime8 = finishLinked8.getTime() - startLinked8.getTime();
        System.out.print("add 1kk elements HashSet: ");
        System.out.println(linkedTime8);

        Date startLinkedl = new Date();
        for(int i = 0; i < 1000000; i++) {
            ts.contains(i);
        }
        Date finishLinkedl = new Date();
        long linkedTimel = finishLinkedl.getTime() - startLinkedl.getTime();
        System.out.print("find 1kk elements TreeSet: ");
        System.out.println(linkedTimel);

        Date startLinkedk = new Date();
        for(int i = 0; i < 1000000; i++) {
            hs.contains(i);
        }
        Date finishLinkedk = new Date();
        long linkedTimek = finishLinkedk.getTime() - startLinkedk.getTime();
        System.out.print("find 1kk elements HashSet: ");
        System.out.println(linkedTimek);

        /* Date startLinked4 = new Date();
        for(int i = 0; i < 100000; i++) {
            ll.get(i);
        }
        Date finishLinked4 = new Date();
        long linkedTime4 = finishLinked4.getTime() - startLinked4.getTime();
        System.out.print("find 10k elements LinkedList: ");
        System.out.println(linkedTime4);

        Date startLinked5 = new Date();
        for(int i = 0; i < 100000; i++) {
            al.get(i);
        }
        Date finishLinked5 = new Date();
        long linkedTime5 = finishLinked5.getTime() - startLinked5.getTime();
        System.out.print("find 10k elements ArrayList: ");
        System.out.println(linkedTime5);*/

        Date startLinked2 = new Date();
        for(int i = 1000000 - 1; i > 0; i--) {
            ll.remove(i);
        }
        Date finishLinked2 = new Date();
        long linkedTime2 = finishLinked2.getTime() - startLinked2.getTime();
        System.out.print(" delete 1kk elements LinkedList: ");
        System.out.println(linkedTime2);

        Date startLinked3 = new Date();
        for(int i = 1000000 - 1; i >0; i--) {
            al.remove(i);
        }
        Date finishLinked3 = new Date();
        long linkedTime3 = finishLinked3.getTime() - startLinked3.getTime();
        System.out.print(" delete 1kk elements ArrayList: ");
        System.out.println(linkedTime3);


        Date startLinkedm = new Date();
        for(int i = 1000000 - 1; i > 0; i--) {
            ts.remove(i);
        }
        Date finishLinkedm = new Date();
        long linkedTimem = finishLinkedm.getTime() - startLinkedm.getTime();
        System.out.print(" delete 1kk elements Treeset: ");
        System.out.println(linkedTimem);


        Date startLinkedmp = new Date();
        for(int i = 1000000 - 1; i > 0; i--) {
            hs.remove(i);
        }
        Date finishLinkedmp = new Date();
        long linkedTimemp = finishLinkedmp.getTime() - startLinkedmp.getTime();
        System.out.print(" delete 1kk elements Hashset: ");
        System.out.println(linkedTimemp);
        //////////////////////////////////////
    }

}
