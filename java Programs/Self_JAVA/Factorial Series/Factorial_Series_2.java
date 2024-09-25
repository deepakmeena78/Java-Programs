//1!/1  2!/2  3!/3  4!/4  5!/5   = 34
import java.util.Scanner;
class Factorial_Series_2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int pow = 1;
		int sum = 0;
		
		for(int i = 1;i <= num;i++)
		{
			pow = pow * i;
			int dev = 0;
			dev = pow / i;
			sum = sum + dev;
			System.out.print(i+"!/"+i+"  ");
		}	
		System.out.println(" = "+sum);
	}
}