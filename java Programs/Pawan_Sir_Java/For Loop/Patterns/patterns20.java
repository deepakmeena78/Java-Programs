/*
		1
		12
		1 3
		1  4
		12345

*/
import java.util.Scanner;
class patterns20{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		for(int i = 1;i <= num;i++)
		{
			for(int j = 1;j <= num;j++)
			{
				if(j == 1 || i == 5 || i == j)
					System.out.print(j);
				else 
					System.out.print(" ");
			}
		System.out.println();
		}
	}
}
