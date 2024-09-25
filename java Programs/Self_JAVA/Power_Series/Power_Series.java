//2^1  2^2  2^3  2^4  2^5  = 62
import java.util.Scanner;
class Power_Series{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		System.out.println("Enter Power");
		int num1 = sc.nextInt();
		int a = 1;
		int sum = 0;
		
		for(int i = 1;i <= num1;i++){
			a = a * num;
			System.out.print(num+"^"+i+"  ");
			sum = sum + a;
		}
		System.out.println("= "+sum);
	}		
}	