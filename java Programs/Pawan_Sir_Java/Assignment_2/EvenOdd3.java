import java.util.Scanner;
class EvenOdd3{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int a = sc.nextInt();
		
		if((a / 2)*2 == a){
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
	}
}