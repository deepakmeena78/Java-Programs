//4.A school has following rules for grading system:
import java.util.Scanner;
class GradeSystem{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		if(num >= 80){
			System.out.println("A Grade ");
		}
		else if(num >= 60){
			System.out.println("B Grade ");
		}
		else if(num >= 50){
			System.out.println("C Grade");
		}
		else if(num >= 40){
			System.out.println("D Grade");
		}
		else if(num >= 30){
			System.out.println("E Grade");
		}
		else if(num < 30){
			System.out.println("Fail");
		}
	}
}