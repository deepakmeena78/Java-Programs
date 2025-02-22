import java.util.*;

public class ComprableCode2 {
    public static void main(String[] args) {

        Set<String> s = new TreeSet<String>(new MySorting());

        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");

        System.out.println(s);

    }
}

class MySorting implements Comparator<String> {

    public int compare(String i1, String i2) {

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
