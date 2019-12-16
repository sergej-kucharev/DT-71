package Task5;

import java.util.Comparator;

public class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String e1,String e2){
        return e1.compareToIgnoreCase(e2);
        }
}
