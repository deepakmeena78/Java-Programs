import java.util.Scanner;
class CalculateRectangle{
	public static void main(String args []){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Length cm.");
		int le = sc.nextInt();
		
		System.out.println("Enter Width  cm.");
		int Width  = sc.nextInt();
		
		int a = Width  * le;
		System.out.println("Calculat Area cm "+a);
	}
}

