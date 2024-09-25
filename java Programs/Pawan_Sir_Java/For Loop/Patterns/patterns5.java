/*
		12345
		12345
		12345
		12345
		12345
*/
import java.util.Scanner;
class patterns5{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		for(int i = 1;i <= num;i++)
		{
			for(int j = 1;j <= num;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}