import java.util.Scanner;
class ExchangeValue{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter b Digit");
		int b = sc.nextInt();
		
		System.out.println("Enter a Digit ");
		int a = sc.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("  b Velue  "+b+"\n a Value  "+a);
	}
}
