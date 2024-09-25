/*			A B C D E
			A     D
			A   C
			A B
			A
*/
import java.util.Scanner;
class patterns35{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		for(int i = num;i >= 1;i--)
		{
			char ch = 65;
			for(int j = 1;j <= i;j++)
			{
				if(i == j || j == 1 || i == num)
					System.out.print(" "+ch);
				else
					System.out.print("  ");
					ch++;
			}
		System.out.println();
		}
	}
}
