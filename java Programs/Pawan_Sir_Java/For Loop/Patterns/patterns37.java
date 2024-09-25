/*		55555
		4  4
		3 3
		22
		1
*/
import java.util.Scanner;
class patterns37{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		for(int i = num;i >= 1;i--)
		{
			for(int j = 1;j <= i;j++)
			{
				if(i == j || j == 1 || i == num)
					System.out.print(i);
				else
					System.out.print(" ");
			}
		System.out.println();
		}
	}
}
