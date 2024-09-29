public class ComparableGetSet implements Comparable<ComparableGetSet> {

    private int age1;
    private String name;

    public ComparableGetSet(int age1, String name) {
        this.age1 = age1;
        this.name = name;
    }

    @Override
    public int compareTo(ComparableGetSet o) {
        return this.age1 - o.age1;
    }

    public int age() {
        return age1;
    }
    
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return "age: " + age1 + ", name: " + name;
    }
}
