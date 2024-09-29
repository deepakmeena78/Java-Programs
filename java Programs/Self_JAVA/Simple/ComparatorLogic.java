import java.util.*;

public class ComparatorLogic implements Comparator<ComparatorGetSet> {
    @Override
    public int compare(ComparatorGetSet o1, ComparatorGetSet o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
