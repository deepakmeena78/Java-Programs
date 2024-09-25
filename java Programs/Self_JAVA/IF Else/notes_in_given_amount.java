import java.util.Scanner;
class notes_in_given_amount{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int not = sc.nextInt();
		
		System.out.println(not / 500+"  Nots 500 Ke");
		not = not % 500;
		
		System.out.println(not / 200+"  Nots 200 Ke");
		not = not % 200;
		
		System.out.println(not / 100+"  Nots 100 Ke");
		not = not % 100;
		
		System.out.println(not / 50+"  Nots 50 Ke");
		not = not % 50;
		
		System.out.println(not / 20+"  Nots 20 Ke");
		not = not % 20;
		
		System.out.println(not / 10+"  Nots 10 Ke");
		not = not % 10;
		
		System.out.println(not / 5+"  coins 5 Ke");
		not = not % 5;
		
		System.out.println(not / 2+"  coins 2 Ke");
		not = not % 2;
		
		System.out.println(not+"  coins 1 Ke");
		
	}
	
}