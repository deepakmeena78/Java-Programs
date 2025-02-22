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

import java.util.*;

public class ArrayList_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter Data : ");
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println("Enter Serach Number ");
        int searchNumber = scanner.nextInt();

        System.out.println("Enter Remove Number");
        int removeNumber = scanner.nextInt();

        if (list.contains(searchNumber)) {
            System.out.println("Number " + searchNumber + " exists in the ArrayList");
        } else {
            System.out.println("Number " + searchNumber + " not exists in the ArrayList");
        }

        list.remove(Integer.valueOf(removeNumber));
        System.out.println("ArrayList after removing " + removeNumber);
        printList(list);

        System.out.println("ArrayList elements using normal for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println("ArrayList elements using Iterator interface");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("ArrayList elements using for-each loop");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("ArrayList elements in descending order");
        ArrayList<Integer> descendingList = new ArrayList<>(list);
        descendingList.sort(Collections.reverseOrder());
        printList(descendingList);

        System.out.println("Number of elements in the ArrayList: " + list.size());
    }

    private static void printList(ArrayList<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
