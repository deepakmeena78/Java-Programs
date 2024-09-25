/*
		1
		23
		456
		78910
*/
import java.util.Scanner;
class patterns14{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt(),a = 1;
		
		for(int i = 1;i <= num;i++)
		{
			for(int j = 1;j <= i;j++)
			{
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
	}
}