//35) WAP to count number of digits
import java.util.Scanner;
class CountDigits{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int count = 0;
		while(1 <= num)
		{
			count++;
			num = num / 10;
		}
		System.out.println("Digit "+count);
	}
}