import java.util.Scanner;
class WithoutVariable{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A value");
		int a = sc.nextInt();
		
		System.out.println("Enter B value");
		int b = sc.nextInt();
		
		b = a ^ b;
		a = b ^ a;
		b = b ^ a;
		
		System.out.println("A  "+a+"  \nB  "+b);
	}
}
		