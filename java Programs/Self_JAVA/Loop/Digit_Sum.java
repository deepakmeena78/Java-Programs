import java.util.Scanner;
class Digit_Sum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int a = 0;
		int b = 0;
		
		for (;num > 0;num = num / 10){
			a = num % 10;
			b = b + a;
		}
		System.out.println(b);
		
		
		
		
		
		
		
	}
}