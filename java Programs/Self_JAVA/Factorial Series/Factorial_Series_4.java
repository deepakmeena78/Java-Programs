//2/1! + 3/2! + 4/3! + 5/4! + 6/5! = 4.425
import java.util.Scanner;
class Factorial_Series_4{
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
			fact = (i + 1) / pow;
			sum = sum + fact;
			System.out.print((i + 1)+"/"+i+"! ");
		}
		System.out.println(" = "+sum);
	}
}