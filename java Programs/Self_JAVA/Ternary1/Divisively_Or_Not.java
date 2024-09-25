import java.util.Scanner;
class Divisively_Or_Not{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		System.out.println("Enter Divisively Number");
		int divi = sc.nextInt();
		
		String s = num % divi == 0 ? "Divisively" : "Not Divisively";
		System.out.println(s);
	}
}