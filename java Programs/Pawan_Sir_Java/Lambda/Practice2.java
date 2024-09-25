@FunctionalInterface
interface P{
            void Show();
            default void Display(){
                System.out.println("default method");
            }
            default void Display1(){
                System.out.println("default method");
            }
            default void Display2(){
                System.out.println("default method");
            }
}

public class Practice2 {
    public static void main(String ar[]){
                P ref = ()->System.out.println("lembda test");
                ref.Show();
                ref.Display();










    }
}
