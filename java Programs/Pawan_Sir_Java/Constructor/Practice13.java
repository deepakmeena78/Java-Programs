class Auto {
    Auto() {
        System.out.println("Parant Class Constructor");
    }
}

class Auto1 extends Auto{
    Auto1() {
        System.out.println("Child Class Constructor");
    }
}

public class Practice13 {
    public static void main(String args[]) {
        Auto1 Au = new Auto1();
    }
}
