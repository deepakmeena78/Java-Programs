import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Meena");
        map.put(2, "Karan");
        map.put(3, "Meena");
        map.put(4, "Yo");
        map.put(4, "Yo");

        System.out.println(map);

        Set<Integer> a = map.keySet();
        // System.out.println(a);

        Collection<String> c = map.values();
        // System.out.println(c);

        Set s2 = map.entrySet();
        // System.out.println(s2);

        Iterator itr = a.iterator();
        while (itr.hasNext()) {
            Integer i1 = (Integer) itr.next();
            System.out.println(i1);
        }

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key + " -> " + map.get(key));
        }

        Iterator iterator2 = s2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry en = (Map.Entry)iterator2.next();
            System.out.println(en);
        }
    } 
}