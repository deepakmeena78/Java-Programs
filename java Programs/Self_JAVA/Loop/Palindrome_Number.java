import java.util.Scanner;
class Palindrome_Number {
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int a = 0;
		int rev = 0;
		int b = num;
		
		for (;num > 0; num = num / 10) {
			 a = num % 10;
			rev = rev * 10 + a;
		}
		 if (rev == b){
			System.out.println("Palindrome_Number");
		}
		else {
			System.out.println("NOT Palindrome_Number ");
		}
	}
}