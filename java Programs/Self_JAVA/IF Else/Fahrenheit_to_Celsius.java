//WAP to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit. 
import java.util.Scanner;
class Fahrenheit_to_Celsius{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Temperature");
		int tem = sc.nextInt();
		int a = 0;
		
		a = (tem - 32)/(9/5);
		System.out.println(a+"  Celsius");
	}
}
	




