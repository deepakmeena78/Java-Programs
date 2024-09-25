import java.util.Scanner;
class GreaterThree{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cheeku");
		int cheeku = sc.nextInt();
		
		System.out.println("Enter peeku");
		int peeku = sc.nextInt();
		
		System.out.println("Enter seela");
		int seela = sc.nextInt();
		
		if (cheeku > peeku && cheeku > seela){
			System.out.println("Cheeku Is Greater");
		}
		else if (peeku > cheeku && peeku > seela){
			System.out.println("Peeku Is Greater");
		}
		else if (seela > cheeku && seela > peeku){
			System.out.println("Seela Is Greater");
		}
	}
}
		
		