public class BasicPractie1 {
    public static void main(String[] args) {

        String s = "Ankit";
        String s1 = new String("Ankit");
        System.out.println(s==s1);
        System.out.println(s.equals("ankit"));
        System.out.println(s.equalsIgnoreCase("ankit"));

    }
}