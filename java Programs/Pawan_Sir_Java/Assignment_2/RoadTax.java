import java.util.Scanner;
class RoadTax{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter K.M.");
		int num = sc.nextInt();
		double a = 0;
		
		if(num > 100000){
			a = num / 5;
			System.out.println("5 % "+(num - a));
		}
		else if(num > 50000){
			a = num / 10;
			System.out.println("10 % "+(num - a));
		}
		else if(num > 0){
			a = num / 20;
			System.out.println("20 % "+(num - a));
		}
	}
}