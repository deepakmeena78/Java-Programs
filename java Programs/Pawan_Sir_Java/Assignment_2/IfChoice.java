import java.util.Scanner;
class IfChoice{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter NUm1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Num2");
		int num2 = sc.nextInt();
		
		System.out.println("Enter\n+\n>\n==");
		String ch = sc.next();
		
		if(ch.equals("+")){
			System.out.println("+ "+(num1 + num2));
		}
		else if(ch.equals(">")){
			if(num1 > num2)
				System.out.println("num 1 Greater");
			else
				System.out.println("num 2 Greater");
		}
		else if(ch.equals("==")){
			if(num1 == num2)
				System.out.println("Equal");
			else
				System.out.println("Not Equal");
		}
	}
}