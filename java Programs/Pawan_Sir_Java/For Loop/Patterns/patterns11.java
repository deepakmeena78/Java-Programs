/*
		A
		AB
		ABC
		ABCD
		ABCDE
*/
import java.util.Scanner;
class patterns11{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		for(int i = 1;i <= num;i++)
		{
			char ch = 65;
			for(int j = 1;j <= i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}