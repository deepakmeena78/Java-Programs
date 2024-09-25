//36) WAP to reverse a number
import java.util.Scanner;
class ReverseNumber{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int a = 0;
		while(1 <= num)
		{
			a = num % 10;
			System.out.print(a);
			num = num / 10;
		}
	}
}