public class Practice6 {
    public static void main(String[] args) {
        Person pn = new Person();
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(String name, String age) {
        return "name" + name + " age" + age;
    }
}