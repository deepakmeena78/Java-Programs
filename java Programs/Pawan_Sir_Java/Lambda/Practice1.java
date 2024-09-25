import java.lang.FunctionalInterface;

@FunctionalInterface
interface MyInterface {
    public void getPiValue();

    public static void Pet() {
        System.out.println("Ankit");
    }
}

class pettest {
    public void getPiValue() {
        System.out.println("Ankit");
    }

    public void pet() {
        System.out.println("Ankit");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        MyInterface obj;
        obj = () -> {
            System.out.println("Deepak");
        };
        obj = () -> {
            System.out.println("Meena");
        };
    }
}