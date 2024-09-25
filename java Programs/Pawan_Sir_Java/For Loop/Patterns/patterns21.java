/*
		1
		22
		3 3
		4  4
		55555
*/
import java.util.Scanner;
class patterns21{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		for(int i = 1;i <= num;i++)
		{
			for(int j = 1;j <= num;j++)
			{
				if(j == 1 || i == 5 || i == j)
					System.out.print(i);
				else 
					System.out.print(" ");
			}
		System.out.println();
		}
	}
}
