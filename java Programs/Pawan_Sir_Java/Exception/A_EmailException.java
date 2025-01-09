/* Validating Email Address and Handling Custom Exceptions

Write a program to validate an email address and display appropriate exceptions if any errors are encountered.
Create 3 custom exception classes as below
1.	DotException
2.	AtTheRateException
3.	DomainException
A typical email address should include a '.' character, '@' character, and a valid domain name. Valid domain names for practice include 'in', 'com', 'net', or 'biz'.
Input format :
The first line of input contains the email to be validated.
Output format :
Print 'Valid email address' if the email address provided meets the criteria, or 'Invalid email address' along with the appropriate exception message. Display 'Invalid Dot usage', 'Invalid @ usage', or 'Invalid Domain' messages based on the email ID provided.
Refer to the sample output for reference.
Sample test cases :
Input 1 :
sample@gmail.com
Output 1 :
Valid email address
Input 2 :
sample@gmail.com.
Output 2 :
DotException: Invalid Dot usage
Invalid email address
Input 3 :
sample@g@mail.com
Output 3 :
AtTheRateException: Invalid @ usage
Invalid email address
Input 4 :
sample@gmail.con
Output 4 :
DomainException: Invalid Domain
Invalid email address */

import java.io.Serial;
import java.util.Scanner;

class DotException extends RuntimeException {
    DotException(String s) {
        super(s);
    }
}

class AtTheRateException extends RuntimeException {
    AtTheRateException(String s) {
        super(s);
    }
}

class DomainException extends RuntimeException {
    DomainException(String s) {
        super(s);
    }
}

public class A_EmailException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Email : ");
        String email = sc.nextLine().toLowerCase();

        int dout = 0;
        int atrate = 0;
        int dutcom = 0;
        String s[] = email.split(".");
        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (ch == '.') {
                dout++;
            } else if (ch == '@') {
                atrate++;
            }
        }
        for (int i = 0; i < s.length; i++) {
            if (s[i] == "in" || s[i] == "com" || s[i] == "net" || s[i] == "biz") {
                dutcom++;
            }
        }

        if (dout > 1) {
            throw new DotException("Invalid Dot usage : Invalid email address");
        } else if (atrate > 1) {
            throw new AtTheRateException("Invalid @ usage : Invalid email address");
        } else if (dutcom > 1) {
            throw new DomainException(" Invalid Domain : Invalid email address");
        } else {
            System.out.println("Valid email address");
        }
    }
}
