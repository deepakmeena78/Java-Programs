//x^1/1 + x^2/2 + x^3/3 + x^4/4 + x^5/5
import java.util.Scanner;
class Power_Series_1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		System.out.println("Enter Power");
		int num1 = sc.nextInt();
		int power = 1;
		float sum = 0;
		
		for(int i = 1;i <= num1;i++){
			//power = power * num / i;
			power = i / power * num;
			System.out.print(num+"^"+i+"  ");
			sum = sum + power;
		}
		System.out.println("= "+sum);
	}		
}	