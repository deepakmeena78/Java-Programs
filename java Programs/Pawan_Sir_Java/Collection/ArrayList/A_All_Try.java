/*QNO 1.

Write a Java program that takes integer data from the user and adds it to an ArrayList. Perform the following operations:

1.	Check if a given number exists in the ArrayList or not.
2.	Remove a particular element from the ArrayList and display the updated ArrayList.
     3. Print all the elements of the ArrayList using a for loop.
   4. Print all the elements using the Iterator interface.
   5. Print all the elements using the for-each loop.
   6. Print all the elements in descending order.
  7. Count how many elements are there in the ArrayList. 
Input format :
The first line of the input should contain an integer representing the size of the ArrayList
The second line of the input should contain the elements to be added to the ArrayList
The third line of the input should contain the number to be searched in the ArrayList.
The fourth line of the input should contain the number to be removed from the ArrayList
Output format :
The output should display the elements in the list after the removal.
Refer to the sample output for reference.
Sample test cases :
Input 1 :
5
10 12 14 16 18
10
20
Output 1 :
Number 10 exists in the ArrayList
ArrayList after removing 20
10 12 14 16 18 
ArrayList elements using normal for loop
10 12 14 16 18 
ArrayList elements using Iterator interface
10 12 14 16 18 
ArrayList elements using for-each loop
10 12 14 16 18 
ArrayList elements in descending order
18 16 14 12 10 
Number of elements in the ArrayList: 5
Input 2 :
8
20 18 17 45 89 63 27 90
10
20
Output 2 :
Number 10 not exists in the ArrayList
ArrayList after removing 20
18 17 45 89 63 27 90 
ArrayList elements using normal for loop
18 17 45 89 63 27 90 
ArrayList elements using Iterator interface
18 17 45 89 63 27 90 
ArrayList elements using for-each loop
18 17 45 89 63 27 90 
ArrayList elements in descending order
90 89 63 45 27 18 17 
Number of elements
 */

import java.util.ArrayList;
import java.util.Scanner;

public class A_All_Try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Of ArrayList : ");
        int size = sc.nextInt();

        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("Enter Numbers : ");
        for (int i = 0; i < size; i++) {
            al.add(sc.nextInt());
        }

        System.out.println("Enter Search Number : ");
        int search = sc.nextInt();

        System.out.println("Enter Remove Number : ");
        int remove = sc.nextInt();

        for (int x : al) {
            if (x == search) {
                System.out.println("Search Number : " + x);
            }
        }

        al.remove(al.get(remove));

        // for(int i = 0;;i++){
        //     al.get(i);
        // }
    }
}
