public class WrapperClass6 {
    public static void main(String[] args) {

        Boolean b = new Boolean(true);// true
        Boolean b1 = new Boolean(false);// false
        // Boolean b2 = new Boolean(True);//invalid
        Boolean b3 = new Boolean("Deepak");// false
        Boolean b4 = new Boolean("yes");// false
        Boolean b5 = new Boolean("no");// false
        Boolean b6 = new Boolean("True");// true
        Boolean b7 = new Boolean("true");// true
        Boolean b8 = new Boolean("TruE");// true
        System.out.println(b + " " + b1 + " " + b3 + " " + b4 + " " + b5 + " " + b6 + " " + b7 + " " + b8);
    }
}
