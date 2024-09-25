import java.util.Scanner;
class LowestNumber{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("number 1");
		int num1 = sc.nextInt();
		
		System.out.println("number 2");
		int num2 = sc.nextInt();
		
		System.out.println("number 3");
		int num3 = sc.nextInt();
		
		System.out.println("number 4");
		int num4 = sc.nextInt();
		
		if (num1 < num2 && num1 < num3 && num1 < num4){
			System.out.println("Num 1 is Small");
		}
		else if (num2 < num1 && num2 < num3 && num2 < num4 ){
			System.out.println("Num 2 is Small");
		}
		else if (num3 < num1 && num3 < num2 && num3 < num4){
			System.out.println("Num 3 is Small");
		}
		else if (num4 < num1 && num4 < num2 && num4 < num3){
			System.out.println("Num 4 is Small");
		}
	}
}