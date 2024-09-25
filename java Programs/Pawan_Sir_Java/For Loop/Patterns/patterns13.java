/*
		1
		01
		101
		0101
		10101
*/
import java.util.Scanner;
class patterns13{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt(),a = 0;
		
		for(int i = 1;i <= num;i++)
		{
			if(i % 2 != 0)
				a = 1;
			else
				a = 0;
			for(int j = 1;j <= i;j++)
			{
				System.out.print(a);
				if(a == 0)
					a = 1;
				else
					a = 0;
			}
			System.out.println();
		}
	}
}