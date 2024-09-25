//44) WAP to interchange first and last digit of a number
import java.util.Scanner;
class InterchangeNumber{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();/*
		1
		22
		333
		4444
		55555
*/
import java.util.Scanner;
class patterns11{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		for(int i = 1;i <= num;i++)
		{
			for(int j = 1;j <= i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
		int i = 1,tem = 1,j = 0;
		while(i <= num){
			j = num % 10;