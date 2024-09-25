import java.util.Scanner;
class calculator{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		
		System.out.println("Enter Opreter\n+\n-\n*\n/\n%");
		char ch = sc.next().charAt(0);
		
		switch (ch){
			case '*' :{
				System.out.println(num1 * num2);
			break;
			}
			case '+' :{
				System.out.println(num1 + num2);
			break;
			}
			case '/' :{
				System.out.println(num1 / num2);
			break;
			}
			case '-' :{
				System.out.println(num1 - num2);
			break;
			}
			case '%' :{
				System.out.println(num1 % num2);
			break;
			}
			default :
			System.out.println("Chack Number");
		}
	}
}