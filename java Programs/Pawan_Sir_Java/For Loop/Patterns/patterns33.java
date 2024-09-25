/*			EEEEE
			DDDD
			CCC
			BB
			A
*/
import java.util.Scanner;
class patterns33{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		char ch = 69;
		
		for(int i = num;i >= 1;i--)
		{
			for(int j = 1;j <= i;j++)
			{
				System.out.print(ch);
			}
		ch--;
		System.out.println();
		}
	}
}
