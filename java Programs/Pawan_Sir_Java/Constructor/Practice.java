public class Practice {
    
    String name;
    int rolln;

    Practice(String name, int rolln) {
        this.name = name;
        this.rolln = rolln;
    }

    public static void main(String[] args) {
        Practice p = new Practice("Ankit ", 34);
        System.out.println(p.name+" "+p.rolln);
    }
}