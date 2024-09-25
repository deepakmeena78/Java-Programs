public class CountMethad {
    static int a;

    public CountMethad(int a) {
        this.a = a;
        System.out.println(a);
    }

    public CountMethad() {
        System.out.println("M");
    }

    public static void main(String[] args) {
        CountMethad b = new CountMethad(10);
        CountMethad b1 = new CountMethad(15);
        CountMethad b2 = new CountMethad(20);

        System.out.println(b.a);
        System.out.println(b1.a);
        System.out.println(b2.a);

    }
}