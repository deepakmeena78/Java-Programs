//WAP to take any age and check age criteria (child, teen, young, old)

import java.util.Scanner;
class check_age_criteria{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int age = sc.nextInt();
		
		if(age >= 60){
			System.out.println("Senior Adult");
		}
		else if (age >= 40){
				System.out.println("Middle Age Adult");
		}
	    else if (age >= 20){
				System.out.println("Adult");
		}
	    else if (age >= 13){
				System.out.println("Teen");
		}
		else if (age >= 0){
				System.out.println("Child");
		}
			
			
		
	}
}