public class Practice4 {
    private Practice4(){
        System.out.println("Private Constructor");
    }
    public static void main(String args []){
        Practice4 call = new Practice4();
        Practice4 call1 = new Practice4();
    }
}
