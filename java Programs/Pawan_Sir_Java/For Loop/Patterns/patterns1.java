import java.util.Scanner;
class patterns1{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		for(int i = 1;i <= num;i++)
		{
			System.out.print("*");
		}
	}
}