interface InnerPractice4 {
    public void show();
}

public class Practice4 {
    public static void main(String[] args) {
        InnerPractice4 t = () -> System.out.println("Chiku");
        t.show();
    }
}
