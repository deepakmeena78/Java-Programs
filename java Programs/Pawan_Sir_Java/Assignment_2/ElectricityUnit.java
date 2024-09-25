import java.util.Scanner;
class ElectricityUnit{
	public static void main (String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Unit");
		double num = sc.nextInt();
		
		if(num >= 250){
			System.out.println("10/Par Unit  "+(num * 10));
		}
		else if(num >= 100){
			System.out.println("7/Par Unit  "+(num * 7));
		}
		else if(num >= 50){
			System.out.println("5/Par Unit  "+(num * 5));
		}
		else if(num >= 0){
			System.out.println("2/Par Unit  "+(num * 2));
		}
	}
}