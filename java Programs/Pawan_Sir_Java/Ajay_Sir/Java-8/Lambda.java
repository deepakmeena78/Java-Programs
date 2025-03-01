interface Greeting {
    void sayHello();
}

public class Lambda {
    public static void main(String[] args) {
        Greeting greeting = () -> System.out.println("hello");
        greeting.sayHello();
    }
}
