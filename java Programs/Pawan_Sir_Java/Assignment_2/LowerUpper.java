import java.util.Scanner;
class LowerUpper{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Character");
		char ch = sc.next().charAt(0);
		int a = ch;
	
		if(a > 97)
			System.out.println("Lower Case");
		else
			System.out.println("Upper Case");
	}
}