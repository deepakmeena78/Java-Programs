public class Practice5 {
    private Practice5(int luky){
        System.out.println(luky+" Private Constructor with Argument");
    }
    public static void main(String args []){
        Practice5 call = new Practice5(1);

    }
}
