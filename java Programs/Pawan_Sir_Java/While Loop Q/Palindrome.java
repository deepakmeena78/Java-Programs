//37) WAP to check whether entered number is palindrome or not
import java.util.Scanner;
class Palindrome{ 
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
	    int sum = 0,com = num;
		while(1 <= num)
		{
		sum = (sum * 10)+(num % 10);
			num = num / 10;
		}
		if(sum == com){
			System.out.println("Palindrome Number");
		}
		else{
			System.out.println("Not Palindrome Number");
		}
	}
}