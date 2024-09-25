/*		123456
		54321
		1234
		321
		12
		1
*/
import java.util.Scanner;
class patterns38{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int a = 1;
		
		for(int i = num;i >= 1;i--)
		{
			for(int j = 1;j <= i;j++)
			{
				if(i % 2 != 0){
					System.out.print(a);
					a++;
				}
				else{
					a--;
					System.out.print(a);
				}
			}
		System.out.println();
		}
	}
}
