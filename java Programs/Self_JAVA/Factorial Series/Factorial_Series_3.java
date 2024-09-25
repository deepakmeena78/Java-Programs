//1!/2  2!/3  3!/4  4!/5  5!/6  = 27.466667
import java.util.Scanner;
class Factorial_Series_3{
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
			dev = pow / (i + 1);
			sum = sum + dev;
			System.out.print(i+"!/"+(i + 1)+"  ");
		}		}
		System.out.println(sum);
	}
}