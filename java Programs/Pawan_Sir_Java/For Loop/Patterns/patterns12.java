/*
		a
		ab
		abc
		abcd
		abcde
*/
import java.util.Scanner;
class patterns12{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		for(int i = 1;i <= num;i++)
		{
			char ch = 97;
			for(int j = 1;j <= i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}