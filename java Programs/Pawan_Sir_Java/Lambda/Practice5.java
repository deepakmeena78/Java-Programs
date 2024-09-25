@FunctionalInterface
interface SProcessor {
    void process(String str);
}

public class Practice5 {
    public static void main(String[] args) {
        // Using a lambda expression
        SProcessor pr = str -> System.out.println(str.toUpperCase());
        // Calling the process method
        pr.process("ankit");
        pr.process("Meena");
    }
}
