import java.util.ArrayList;
import java.util.Scanner;

/*Search in an ArrayList
Objective: Write a program to search for an element in an ArrayList.

Tasks:

Allow the user to enter multiple strings into an ArrayList.
Prompt the user to enter a string to search for.
Check if the string exists in the list and display its position(s).
 */


class ArrayList7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<String>();

        al.add("Ajeet");
        al.add("Deepak");
        al.add("Vishal");
        al.add("Rishabh");

        System.out.print("Enter a String : " );
        String find = sc.next();
        int index = 0;
        for(String s : al){

            if(find.equals(s)){
                System.out.print(index);
            }
            index++;
        }
    }
}
