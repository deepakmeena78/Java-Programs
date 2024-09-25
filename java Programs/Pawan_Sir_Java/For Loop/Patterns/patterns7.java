/*
		1
		00
		111
		0000
		11111
*/
import java.util.Scanner;
class patterns7{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		for(int i = 1;i <= num;i++)
		{
			for(int j = 1;j <= i;j++)
			{
				if(i % 2 == 0){
					System.out.print("0");
				}
				else{
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}
}