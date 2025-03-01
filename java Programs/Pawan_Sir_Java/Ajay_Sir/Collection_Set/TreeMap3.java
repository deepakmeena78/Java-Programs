import java.util.PriorityQueue;

public class TreeMap3 {
    public static void main(String[] args) {

        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.offer(20);
        p.offer(10);
        p.offer(40);
        p.offer(30);
        System.out.println(p);
        System.out.println("Peek : " + p.peek());
        System.out.println("Poll : " + p.poll());
        System.out.println(p);
    }
}
