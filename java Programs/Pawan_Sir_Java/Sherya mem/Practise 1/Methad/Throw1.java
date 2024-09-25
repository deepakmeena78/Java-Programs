
public class Throw1 {
    public static void main(String[] args) {
        try {
            //ThrowN obj = new ThrowN();
            System.out.println(m1(35));
        } catch (Exception e) {
            System.out.println("Age 18+");
        }
    }

    public static int m1(int age) throws ArithmeticException {
        if (age < 18) {
            System.out.println("Not Valid");
        }
        throw new ArithmeticException("Arithmetic Exception");
    }
}