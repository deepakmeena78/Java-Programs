public class Practice10 {
    
    Practice10(){
        System.out.println(this);
        System.out.println(this.hashCode());
    }
    public static void main(String[] args) {
        Practice10 s = new Practice10();
    }
}
