import java.util.Scanner;
class CalculateArea{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Area");
		int num = sc.nextInt();
		
		double a =(22 * num * num) / 7;
		System.out.println("Area "+a);
	}
}