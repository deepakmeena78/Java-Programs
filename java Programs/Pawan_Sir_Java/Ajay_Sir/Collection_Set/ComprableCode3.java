import java.util.*;

public class ComprableCode3 {
    public static void main(String[] args) {

        Set<Double> s = new TreeSet<Double>(new MySorting());

        s.add(20.2);
        s.add(71.2);
        s.add(43.5);
        s.add(34.6);
        s.add(3.7);

        System.out.println(s);

    }
}

class MySorting implements Comparator<Double> {

    public int compare(Double i1, Double i2) {

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
