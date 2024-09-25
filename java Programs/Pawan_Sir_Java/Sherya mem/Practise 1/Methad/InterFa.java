// interface sam {

//     default void kays() {
//         System.out.println("f . 16");
//     }
// }

// class HP implements sam {
//     public void kays() {
//         System.out.println("f 88");
//     }
// }

// class Dell implements sam {
//     public void kays() {
//         System.out.println("G 44");
//     }
// }

// class Lenevo implements sam {
//     public void kays() {
//         System.out.println("g 23");
//     }
// }

// public class InterFa {
//     public static void main(String[] args) {
//         Lenevo k = new Lenevo ();
//         k.kays();
//     }
// }

interface sam {
    static void kays() {
        System.out.println("static method");
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

public class InterFa {
    public static void main(String[] args) {
        sam.kays();
        HP obj2 = new HP();
        obj2.kays();
        Lenevo obj1 = new Lenevo();
        obj1.kays();
    }
}
