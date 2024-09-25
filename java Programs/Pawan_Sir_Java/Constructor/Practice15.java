class E {
    E() {
        System.out.println("Parant Class");
    }
}

class Ex extends E {
    Ex() {
        System.out.println("Child Class");
    }
}

public class Practice15 {
    public static void main(String[] args) {
        E e = new E();
    }
}
