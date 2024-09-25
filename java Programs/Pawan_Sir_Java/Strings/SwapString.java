public class SwapString {
    public static void main(String[] args) {

        String a = "panchali";
        String b = "Atul";
        a = a + b;
        System.out.println(" a " + a + " b " + b);
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println(" a " + a + " b " + b);
    }
}
