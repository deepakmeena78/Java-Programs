public class WrapperClass7 {
    public static void main(String[] args) {

        Boolean b = new Boolean("true");
        Boolean b1 = new Boolean("false");
        System.out.println(b);// false
        System.out.println(b1);// false
        System.out.println(b.equals(b1));// true
    }
}
