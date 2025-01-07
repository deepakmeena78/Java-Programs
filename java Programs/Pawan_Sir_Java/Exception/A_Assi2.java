/*Create a class named Main with the attribute "number" as an integer.
Write a program to catch IllegalArgumentException and ArithmeticException for the given input.
1.	If the input provided is 0, the program should throw an "ArithmeticException" with a message.
2.	If the input provided is greater than 7, the program should throw an "IllegalArgumentException" with a message.
3.	If neither of the above cases is true, the program should return the given number.

HINT: Use nested try block for both the exception.
Input format :
Input consists of an integer.
Output format :
Refer to the sample output for reference.
Sample test cases :
Input 1 :
5
Output 1 :
5
Input 2 :
8
Output 2 :
IllegalArgumentException caught - Number should not be greater than 7
Input 3 :
0
Output 3 :
ArithmeticException caught - / by zero
 */

import java.util.Scanner;

public class A_Assi2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        try {
            if (num == 0) {
                throw new ArithmeticException("ArithmeticException : " + num);
            } else if (num > 7) {
                throw new IllegalAccessException("IllegalArgumentException : " + num);
            } else {
                System.out.println("Your Input : " + num);
            }
        } catch (Exception e) {

        }
    }
}
