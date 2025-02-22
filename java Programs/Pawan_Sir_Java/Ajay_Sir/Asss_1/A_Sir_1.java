
import java.util.ArrayList;

/*
  WAP to store integer values in arraylist and display only those values which are even.
 */


class ArrayList4 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(3);
        al.add(4);
        al.add(7);
        al.add(8);

        for(Integer i : al){

            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
