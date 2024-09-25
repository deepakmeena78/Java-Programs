//1/1!  3/2!  5/3!  7/4!  9/5!   = 3.7
import java.util.Scanner;
class Factorial_Series_9{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		float fact = 1;
		float sum = 0;
		int ex = 1;
		
		for(int i = 1;i <= num;i++)
		{
			fact = fact * i;
			float dev = 0;
			//System.out.print(i);
			dev = ex / fact;
			sum = sum + dev;
			System.out.print( ex + "/"+i+"!  ");
            ex = ex + 2;			
		}
		System.out.println(" = "+sum);
	}
}