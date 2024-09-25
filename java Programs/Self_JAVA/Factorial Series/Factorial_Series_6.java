//2/1! 4/2! 6/3! 8/4! 10/5!  = 5.416667
import java.util.Scanner;
class Factorial_Series_6{
	public static void main(String [] args){
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		float pow = 1;
		float sum = 0;
		
		for(int i = 1;i <= num;i++)
		{
			pow = pow * i;
			float fact = 0;
			fact = (i * 2) / pow;
			sum = sum + fact;
			System.out.print((i * 2)+"/"+i+"! ");
		}
		System.out.println(" = "+sum);
	}
}