import java.util.Scanner;
class Calculator{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
				
		System.out.println("Enter Number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Charactor \n+\n-\n*\n/\n");
		char ch = sc.next().charAt(0);
		
		if (ch == '+'){
			System.out.println(num + num1);
		}
		else if (ch == '-'){
			System.out.println(num - num1);
		}
        else if (ch == '*'){
			System.out.println(num * num1);
		}
		else if (ch == '/'){
			System.out.println(num / num);
		}
	}
}