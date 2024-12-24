package Backend;

public class PackageTest {

    private int privateee = 10;
    protected int protecteddd = 20;
    public int publiccc = 30;

    public int getPrivateee() {
        return privateee;
    }

    public int getProtecteddd() {
        return protecteddd;
    }

    public int getPubliccc() {
        return publiccc;
    }
}

class Test {

    public static void main(String[] args) {
        PackageTest p = new PackageTest();
        System.out.println(p.getPrivateee());
        System.out.println(p.protecteddd);
        System.out.println(p.publiccc);
    }
}
