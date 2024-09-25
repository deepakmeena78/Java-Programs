import java.util.Scanner;
class Negative_Positive{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		String s = num > 0 ? "Positive" : "Negative";
		System.out.println(s);
	}
}