

/*
Modify an ArrayList
Objective: Develop a program to perform operations on an ArrayList.
Tasks:
Add 5 integers to an ArrayList.
Replace the second element with a new integer.
Remove the third element.
Display the updated ArrayList.
*/

import java.util.ArrayList;

class ArrayList6 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        al.set(1, 11);
        al.remove(2);

        System.out.println(al);
    }
}
