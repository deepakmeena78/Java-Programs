//1!/2  2!/4  3!/6  4!/8  5!/10  = 17.0
import java.util.Scanner;
class Factorial_Series_7{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		float pow = 1;
		float sum = 0;
		
		for(int i = 1;i <= num;i++)
		{
			pow = pow * i;
			float dev = 0;
			dev = pow / (i * 2);
			sum = sum + dev;
			System.out.print(i+"!/"+(i * 2)+"  ");
			if (num == i){
			System.out.print("= ");
			}
		}
		System.out.println(sum);
	}
}