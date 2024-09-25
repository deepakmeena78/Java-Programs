public class RwA1 {
    public void m1(){
        System.out.println("Good");
    }

    public static int m2(int a){
        return a+a;
    }
    public static void main(String[] args) {
        RwA1 k = new RwA1();
        System.out.println(m2(3));
    }
}
