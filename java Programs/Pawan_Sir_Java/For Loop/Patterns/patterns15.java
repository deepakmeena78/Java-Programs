/*
		A
		BB
		CCC
		DDDD
		EEEEE
*/
import java.util.Scanner;
class patterns15{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		char ch = 65;
		
		for(int i = 1;i <= num;i++)
		{
			for(int j = 1;j <= i;j++)
			{
				System.out.print(ch);
			}
		ch++;
		System.out.println();
		}
	}
}
