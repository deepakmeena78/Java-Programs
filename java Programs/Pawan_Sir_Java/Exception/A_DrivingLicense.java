/*Handling Driving License Registration Exceptions

Write a program to approve or display suitable exceptions whenever a person tries to register for a driving license.
Create a class named Main with the following attributes 
1.	name - String
2.	userAge - int
3.	mark - int
Minimum eligibility for obtaining a driving license:
1.	Age should be above 18 years old.
2.	A person should pass the road rules eligibility test (with above 80 marks) for a total mark of 100.
Create two exceptions InvalidAgeForDrivingLicenseException and InvalidMarkForDrivingLicenseException to handle the above scenarios.
Input format :
The first line consists of a name a String.
The second line consists of age as an integer.
The next line consists of marks obtained as integers.
Output format :
The output should display "Approved" if he meets the criteria or the appropriate exception.
Refer to the sample output for reference.
Sample test cases :
Input 1 :
Guru
33
95
Output 1 :
Approved
Input 2 :
Smith
2
95
Output 2 :
InvalidAgeForDrivingLicenseException: Age should be more than 18 years old
Input 3 :
Jack
-3
95
Output 3 :
InvalidAgeForDrivingLicenseException: Invalid age
Input 4 :
Scott
33
75
Output 4 :
InvalidMarkForDrivingLicenseException: Mark should be more than 80
Input 5 :
Mathew
33
-45
Output 5 :
InvalidMarkForDrivingLicenseException: Invalid mark
Input 6 :
Guru
33
195
Output 6 :
InvalidMarkForDrivingLicenseException: Invalid mark */

import java.util.Scanner;

class InvalidAgeForDrivingLicenseException extends RuntimeException {
    InvalidAgeForDrivingLicenseException(String s) {
        super(s);
    }
}

class InvalidMarkForDrivingLicenseException extends RuntimeException {
    InvalidMarkForDrivingLicenseException(String s) {
        super(s);
    }
}

public class A_DrivingLicense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();

        System.out.println("Enter Your Mark : ");
        int mark = sc.nextInt();

        try {
            if (age < 18 && age > 0) {
                throw new InvalidAgeForDrivingLicenseException("Age should be more than 18 years old");
            } else if (age < 0) {
                throw new InvalidAgeForDrivingLicenseException("Invalid age");
            } else if (mark < 80) {
                throw new InvalidMarkForDrivingLicenseException("Mark should be more than 80");
            } else if (mark < 0 || mark > 100) {
                throw new InvalidMarkForDrivingLicenseException(" Invalid mark");
            } else {
                System.out.println("Approved");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
