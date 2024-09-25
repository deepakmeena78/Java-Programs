//1!/1 + 2!/3 + 3!/5 + 4!/7 + 5!/9  =  19.62857
import java.util.Scanner;
class Factorial_Series_8{
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
			System.out.print(i);
			dev = fact / ex;
			sum = sum + dev;
			System.out.print("!/"+ ex +"  ");
            ex = ex + 2;			
		}
		System.out.println(" = "+sum);
	}
}