import java.util.Scanner;
class Evenodd2{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int a = sc.nextInt();
		
		switch (a % 2){
			case 0 :{
				System.out.println("Even Number");
			break;
			}
			default :
			System.out.println("Odd Number");
		}
	}
}