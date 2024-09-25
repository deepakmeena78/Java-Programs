//33) WAP to print Alphabets in reversing order
import java.util.Scanner;
class AlphabetsReversing {
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Start Character");
		char a = sc.next().charAt(0);
		System.out.println("End Character");
		char b = sc.next().charAt(0);
		
		while(b >= a){
			System.out.print(b);
			b--;
		}
	}
}
			
		