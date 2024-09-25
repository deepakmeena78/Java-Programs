public class WrapperClass {
    public static void main(String[] args) {

        Integer j = Integer.valueOf(12);
        System.out.println(j);

        Character ch = Character.valueOf('A');
        System.out.println(ch);

        Boolean b = Boolean.valueOf(true);
        System.out.println(b);

        Boolean b1 = Boolean.valueOf("true");
        System.out.println(b1);

        Boolean b2 = Boolean.valueOf("Ankit");
        System.out.println(b2);

        Boolean b3 = Boolean.valueOf("truE");
        System.out.println(b3);

        Boolean b4 = Boolean.valueOf("tru");
        System.out.println(b4);

        Boolean b5 = Boolean.valueOf("10.4");
        System.out.println(b5);
    }
}