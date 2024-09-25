public class WrapperClass9 {
    public static void main(String[] args) {

        // 15 ka binary 1111
        String s = Integer.toString(15, 2);
        System.out.println(s);
        // Second Option
        String s1 = Integer.toBinaryString(15);
        System.out.println(s1);
        // 3rd Option
        String s2 = Integer.toHexString(15);
        System.out.println(s2);
        // 4th option
        String s3 = Integer.toOctalString(15);
        System.out.println(s3);
    }
}
