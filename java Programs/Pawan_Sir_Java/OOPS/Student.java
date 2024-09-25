public class Student {
    private String name;
    {
        this.name = "aryan";
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public String get() {
        System.out.println(name);
        return name;
    }

    public static void main(String[] args) {
        Student st2 = new Student();
        Student st = new Student("Gwale");
        st2.get();
        st.get();
    }
}