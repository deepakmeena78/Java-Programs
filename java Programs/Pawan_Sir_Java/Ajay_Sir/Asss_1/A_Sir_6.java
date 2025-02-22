
import java.util.ArrayList;

/*
 WAP to store string data in arraylist and convert all the names into upper case which starts from a.
 */

class ArrayList3 {
    
    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<String>();

        al.add("ajeet");
        al.add("vishal");
        al.add("atul");
        al.add("deepak");

        for(String s : al){

            if(s.startsWith("a")){
                s = s.toUpperCase();
                System.out.println(s);
            }
            else{
                System.out.println(s);
            }
        }
    }
}
