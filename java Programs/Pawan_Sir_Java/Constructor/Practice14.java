class Cy{
    Cy(){
        System.out.println("Parent Class Constructor");
    }
}
class Cy1 {
    Cy1(){
        System.out.println("Child Class Constructor");
        Cy cy = new Cy();
    }
}
public class Practice14 {
    public static void main(String[] args) {
        Cy1 y = new Cy1();
    }
    
}
