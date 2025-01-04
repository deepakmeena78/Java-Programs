/*Venue Details

Create a class named Main and create two variables named, venueName and city of type string.
Write a main method to get the venue details in the string separated by a comma. Use String.split() function to display the details.
Input format :
The first line consists of a String that represents the venueName and city.
Output format :
The output should display the venue details.
Refer sample output for formatting specifications.
Sample test cases :
Input 1 :
M. A. Chidambaram Stadium,Chennai
Output 1 :
Venue Details:
Venue Name: M. A. Chidambaram Stadium
City Name: Chennai
Input 2 :
The Oval,London
Output 2 :
Venue Details:
Venue Name: The Oval
City Name: London
Note :
The program will be evaluated only after the “Submit Code” is clicked.
Extra spaces and new line characters in the program output will result in the failure of the test case.
 */

import java.util.Scanner;

public class AS_VenueDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Venue Name And ,Comma Separated, City Name : ");
        String name = sc.nextLine();

        int index = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ',') {
                String[] arr = name.split(",");
                System.out.println("Venue Name : " + arr[index]);
                index++;
                System.out.println("City Name : " + arr[index]);
                break;
            }
        }
    }
}
