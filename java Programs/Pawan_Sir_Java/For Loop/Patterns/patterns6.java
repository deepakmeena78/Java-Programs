/*
		11111
		22222
		33333
		44444
		55555
*/
import java.util.Scanner;
class patterns6{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		for(int i = 1;i <= num;i++)
		{
			for(int j = 1;j <= num;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}