import java.util.Scanner;
class Calculator{
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		System.out.println("Enter Next Number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter operator \n+\n-\n*\n/\n%");
		char ch = sc.next().charAt(0);
		
		switch (ch){
		case '+' :{
			System.out.println(num + num1);
	    break;
		}
		case '-' :{
			System.out.println(num - num1);
	    break;
		}
		case '*' :{
			System.out.println(num * num1);
	    break;
		}case '/' :{
			System.out.println(num / num1);
	    break;
		}case '%' :{
			System.out.println(num % num1);
	    break;
		}
		default :
		System.out.println("Chaeck Your Number");
		
		}
		
		
	}
}