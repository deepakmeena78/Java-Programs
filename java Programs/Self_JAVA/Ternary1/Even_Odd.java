import java.util.Scanner;
class Even_Odd{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		String s = num%2==0?"Even Number":"Odd Number";
		System.out.println(s);
	}
}