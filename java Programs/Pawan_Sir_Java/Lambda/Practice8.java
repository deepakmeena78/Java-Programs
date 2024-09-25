interface InnerPractice8 {
    void in(String s);
}

class Pre {
    public static void in2(String s) {
        System.out.println(s);
    }
}

public class Practice8 {
    public static void main(String[] args) {
        InnerPractice8 inter = Pre::in2;
        inter.in("Ankit");
    };
}
