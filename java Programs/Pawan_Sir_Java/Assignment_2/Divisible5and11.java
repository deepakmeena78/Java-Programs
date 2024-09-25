import java.util.Scanner;
class Divisible5and11{
	public static void main(String args []){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		if(num % 5 == 0 && num % 11 == 0){
			System.out.println("Divisible");
		}
		else {
			System.out.println("Not Divisible");
		}
	}
}