//7) WAP to check whether entered number is prime or not.
import java.util.Scanner;
class PrimeorNot{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int i = 1,sum = 0,count = 0;
		while(i <= num){
			if(num % i == 0){
				count++;
			}
		i++;
		}
		if(count == 2)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
	}
} 