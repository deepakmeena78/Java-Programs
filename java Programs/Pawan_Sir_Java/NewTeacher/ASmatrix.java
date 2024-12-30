/*Problem Statement

Wick is developing a real-time strategy game where the players command armies represented by square matrices. The game requires matrix operations to calculate army strength and overall battle outcomes. 

Write a program to assist Wich that includes an abstract class MatrixOperation with an abstract method performOperation() and a class MatrixAddition. Calculate the army strength by adding all the elements in the given matrices. Display the matrix that represents the army's strength.
Input format :
The first line of input consists of an integer N, representing the number of rows and columns of a square matrix.
The next N lines consist of N space-separated integers, representing the elements of the first matrix.
The following N lines consist of N space-separated integers representing the elements of another matrix.
Output format :
The output prints the army strength, which is the addition of the given matrices.

Refer to the sample output for formatting specifications.
Code constraints :
The given test cases fall under the following constraints:
1 ≤ N ≤ 5
Sample test cases :
Input 1 :
2
1 2
3 4
5 6
7 8
Output 1 :
6 8 
10 12 
Input 2 :
3
1 2 3
4 5 6
7 8 9
10 11 12
13 14 15
16 17 18
Output 2 :
11 13 15 
17 19 21 
23 25 27 */

import java.util.Scanner;

class MatrixOperation {

}

public class ASmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("Enter Matrix Type 1 To 5");
            int num = sc.nextInt();
            int arr[][] = new int[num][num];
            int arr2[][] = new int[num][num];
            if (1 <= num && num <= 5) {
                System.out.println("Enter Element : ");

                flag = false;
            } else {
                System.out.println("Enter Valid Number : 1 To 5");
            }
        }
    }
}
