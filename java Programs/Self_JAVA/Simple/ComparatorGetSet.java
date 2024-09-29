public class ComparatorGetSet {
    private int age;
    private String name;

    public ComparatorGetSet(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "age: " + age + ", name: " + name;
    }
}
