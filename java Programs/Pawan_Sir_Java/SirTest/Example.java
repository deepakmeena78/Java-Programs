public class Example {
    String name = "";

    public void setter(String name) {
        this.name = name;
    }

    public String getter() {
        return name;
    }

    public static void main(String[] args) {
        Example ex = new Example();
        ex.setter("Ankit");
        System.out.println(ex.getter());
    }
}
