class Main {

    public Main() {
        System.out.println("Class : 1  Default");
    }

    public Main(int a) {
        System.out.println("Class : 1  Parameter");
    }

    static {
        System.out.println("Class : 1 Static");
    }
    {
        System.out.println("Class : 1  Intances");
    }
}

class Main2 extends Main {
    public Main2() {
        System.out.println("Class : 2  Default");
    }

    public Main2(int a) {
        super(a);
        System.out.println("Class : 2  Parameter");
    }

    static {
        System.out.println("Class : 2 Static");
    }
    {
        System.out.println("Class : 2  Intanse");
    }
}

class Main3 extends Main2 {
    public Main3() {
        System.out.println("Class : 3  Default");
    }

    public Main3(int a) {
        super(a);
        System.out.println("Class : 3  Parameter");
    }

    static {
        System.out.println("Class : 3 Static");
    }
    {
        System.out.println("Class : 3  Intances");
    }
}

public class OverRiding {
    public static void main(String[] args) {
        Main3 m = new Main3(10);
        Main3 m1 = new Main3();
    }
}
