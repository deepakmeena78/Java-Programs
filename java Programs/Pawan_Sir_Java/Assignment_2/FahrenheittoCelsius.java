import java.util.Scanner;
class FahrenheittoCelsius{
	public static void main(String args []){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Temperature ");
		double num = sc.nextInt();
		
		System.out.println("Fahrenheit to Celsius f\nCelsius To Fahrenheit c");
		char ch = sc.next().charAt(0);
		
		
		if (ch == 'f'){
			double a = (num - 32)/1.8;
			System.out.println(a+"  Celsius");
		}
		else if (ch == 'c'){
			double c = ((num * 1.8)+ 32);
			System.out.println(c+"  Fahrenheit");
		}
	}
}
			
	