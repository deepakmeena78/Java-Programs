import java.util.Scanner;
class CountNotes{
	public static void main (String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Amount");
		int a = sc.nextInt();
		
		System.out.println("500 ke Nots  "+a / 500);
		a = a % 500;
		
		System.out.println("200 ke Nots  "+a / 200);
		a = a % 200;
		
		System.out.println("100 ke Nots  "+a / 100);
		a = a % 100;
		
		System.out.println("50 ke Nots  "+a / 50);
		a = a % 50;
		
		System.out.println("20 ke Nots  "+a / 20);
		a = a % 20;
		
		System.out.println("10 ke Nots  "+a / 10);
		a = a % 10;
		
		System.out.println("5 ke Coins  "+a / 5);
		a = a % 5;
		
		System.out.println("2 ke Coins  "+a / 2);
		a = a % 2;
		
		System.out.println("1 ke Coins  "+a / 1);
	}
}
		