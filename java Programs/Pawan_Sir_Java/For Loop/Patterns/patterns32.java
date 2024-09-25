/*			ABCDE
			ABCD
			ABC
			AB
			A
*/
import java.util.Scanner;
class patterns32{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		for(int i = num;i >= 1;i--)
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
