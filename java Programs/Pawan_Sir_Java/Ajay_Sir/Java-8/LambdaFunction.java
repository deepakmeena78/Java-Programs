interface Data {
    void sum(int a, int b);
}

public class LambdaFunction {
    public static void main(String[] args) {
        Data obj = (a, b) -> System.out.println("Sum: " + (a + b));
        
        obj.sum(10, 20);
    }
}
