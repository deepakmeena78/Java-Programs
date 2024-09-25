public class WrapperClass10 {
    public static void main(String[] args) {
        boolean b = new Boolean(Boolean.valueOf(args[0]));
        boolean b1 = new Boolean(args[1]);
        System.out.println(b + "  " + b1);
    }
}
