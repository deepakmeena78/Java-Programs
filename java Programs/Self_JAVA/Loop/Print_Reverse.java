import java.util.Scanner;
class Print_Reverse{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int a = 0;
		
		for (;num > 0;num = num / 10){
			a = num % 10;
		System.out.print(a);
		}
	}
}