public class BasicPractice {
    public static void main(String[] args) {
        
        String s = "Ankit";
        String s1 = "Ankit";
        System.out.println(s==s1);
        System.out.println(s.equals(s1));

        String s2 = new String("Deepak");
        String s3 = new String("Deepak");
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));
    }
}
