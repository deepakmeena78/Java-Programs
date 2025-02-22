import java.util.*;

public class ComprableCode {

    public static void main(String[] args) {

        Set<Integer> s = new TreeSet<Integer>(new MySorting());

        s.add(10);
        s.add(34);
        s.add(23);
        s.add(54);

        System.out.println(s);

    }
}

class MySorting implements Comparator<Integer> {

    public int compare(Integer i1, Integer i2) {

        // if(i1<i2){
        // return +1;
        // }
        // else if(i1 > i2){
        // return -1;
        // }
        // else{
        // return 0;
        // }

        return -i1.compareTo(i2);
    }
}
