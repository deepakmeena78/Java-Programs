import java.util.Scanner;

// 1! + 2! + 3! + 4! + 5!= 153
class Factorial_Series_1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int pow = 1;
		int sum = 0;
		
		for (int i = 1;i <= num;i++)
		{
			pow = pow * i;
			System.out.print(i+"!");
			if (num != i){
			System.out.print(" + ");
			}
			sum = sum + pow;
		}
		System.out.println(" = "+sum);
	}
}
