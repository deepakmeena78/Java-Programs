
class Yo extends RuntimeException {
    Yo(String s) {
        super(s);
    }
}

public class GenerateException {
    public static void main(String[] args) {

        System.out.println("Main Method ");

        Yo y = new Yo("Yo Yo Honey Singh is the ComeBack");
        throw new Yo("Yo Yo Honey Singh is the ComeBack");
    }
}
