interface sam {
    static void kays() {
        System.out.println("Interfare Kays");
    }
}

class HP implements sam {
    public void kays() {
        System.out.println("hp kays");
    }
}

class Dell implements sam {
    public void kays() {
        System.out.println("Dell kays");
    }
}

class Lenevo implements sam {
    public void kays() {
        System.out.println("lenevo kays");
    }
}

public class InterFa1 {
    public static void main(String[] args) {
        sam.kays();
        HP obj2 = new HP();
        obj2.kays();
        Lenevo obj1 = new Lenevo();
        obj1.kays();
    }
}