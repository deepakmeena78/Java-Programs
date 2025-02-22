
import java.util.ArrayList;

/*
WAP to store integer values in arraylist and display only those numbers which are perfect numbers.
 */

class ArrayList5 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(6);
        al.add(28);
        al.add(756);

        for(Integer i : al){
            int sum = 0;
            for(int j = 1; j <=i/2;j++){

                if(i%j==0){
                    sum = sum + j;
                }
            }
            if(sum==i)
            System.out.println(i);
        }
    
    }
}
