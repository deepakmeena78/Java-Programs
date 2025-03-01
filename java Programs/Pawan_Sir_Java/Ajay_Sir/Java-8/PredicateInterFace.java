//// predicate is a function interface pri defind method test , you can use this method when you required of boolean type

import java.util.function.Predicate;

public class PredicateInterFace {
    public static void main(String[] args) {

        Predicate<Integer> p = n -> n % 2 == 0;
        if (p.test(22)) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
