//38) WAP to check whether entered number is Armstrong or not
import java.util.Scanner;
class Armstrong{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int a = num,b = 0,c = 0;
		
		while(num != 0)
		{
			b = num % 10;
			num = num / 10;
			c = c + b * b * b;
		}
		if(c == a)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong Number");
	}
}