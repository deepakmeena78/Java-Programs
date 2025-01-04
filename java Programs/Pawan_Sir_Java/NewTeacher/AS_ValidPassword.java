/*Valid Password or Not

The HR committee of Sunrise Basket Company decided to enforce the following rules when an employee creates/changes his/her password.

1.	Password should be less than 15 and more than 8 characters in length.
2.	Password should contain at least one upper case and one lower case alphabet.   
3.	Password should contain at least one number.
4.	Password should contain at least one special character.
5.	Password should not contain a space.

The program must accept a given password string "password" as input.
Input format :
The input consists of String that represents password.
Output format :
The output should print "<password> is a valid password" or "<password> is a invalid password".
Refer sample output for formatting specifications.
Sample test cases :
Input 1 :
Ex@1234ab
Output 1 :
Ex@1234ab is a valid password
Input 2 :
Ex!!
Output 2 :
Ex!! is a invalid password
Input 3 :
Abcd @1234
Output 3 :
Abcd @1234 is a invalid 
 */

import java.util.Scanner;

public class AS_ValidPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Password : ");
        String s = sc.nextLine();

        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (s.length() >= 8 && s.length() <= 16 & ch != ' ') {
                if (ch >= 'a' && ch <= 'z') {
                    flag1 = true;
                } else if (ch >= 'A' && ch <= 'Z') {
                    flag2 = true;
                } else if (ch >= '0') {
                    flag3 = true;
                } else if (ch == '#' || ch == '$' || ch == '@') {
                    flag4 = true;
                }
            } else {
                System.out.println("Lenght : jada hai");
            }
        }
        if (flag1 == true && flag2 == true && flag3 == true && flag4 == true) {
            System.out.println(s + " : is a Valid password");
        } else {
            System.out.println(s + " : is a Invalid Password");
        }
    }
}
