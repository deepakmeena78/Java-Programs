import java.util.Scanner;
class ProfitorLoss{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter buy Price");
		int b = sc.nextInt();
		
		System.out.println("Enter Sale Price");
		int s = sc.nextInt();
		
		if(b < s){
			System.out.println("Profit  "+(b - s));
		}
		else if(b > s){
			System.out.println("Loss  "+(s - b));
		}
		else if(b == s){
		System.out.println("Equal");
		}
		else {
			System.out.println("Try Again");
		}
	}
}