


/*
Была создана копия исходного Листа, так как при нахождении очередного
максимума, необходимо запомнить его !
( проверять на наличие этого числа в Листе В - нет смысла,
так как числа в листе А могут повторяться, и тогда, например, у нас
выйти последовательность [ 14, 14, 5 ... 0] - что невозможно получить
без поправки выше )
В целях сохранения памяти можно создать массив из 0 1, который говорил
- взято ли то или иное число в лист В или же нет
 */



import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;


public class task2 {

    public static void main(String[] args) {
        LinkedList<Double> A = new LinkedList<Double>();
        LinkedList<Double> B = new LinkedList<Double>();
        boolean[] b = new boolean[150];

        for( int i = 0; i < 150; i++)
            A.add(Math.random());


        Iterator<Double> iter = A.iterator();
        double temp1, temp2 = 0;
        int index=0;

        for( int i = 0; i < 15; i++){
            temp1 = iter.next();
            for( int j = 1; iter.hasNext(); j++){
                temp2 = iter.next();
                if( (temp2 > temp1 ) & ( !b[j]) ) {
                    temp1 = temp2;
                    index = j;
                }
            }
            B.add(temp1);
            b[index] = true;
            iter = A.iterator();
        }

        System.out.println(B);
        try(FileWriter writer = new FileWriter("task2.txt", false))
        {
            for( int i = 0; i<15; i++)
                writer.write(Double.toString(B.remove(0))+" ");
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }


    }
}
