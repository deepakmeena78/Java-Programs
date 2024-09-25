class Text12 {
    Text12() {
        System.out.println("Parant Class Coustructor");
    }
}

class Text22 extends Text12 {
    Text22(int a) {  // Automatic super call parant 
        System.out.println(a + " Chid class Constroctor");
    }
}

public class Practice12 {
    public static void main(String args[]) {
        System.out.println("Ankit Main Method");
        //Text12 t12 = new Text12();
        Text22 t22 = new Text22(7);
    }
}
