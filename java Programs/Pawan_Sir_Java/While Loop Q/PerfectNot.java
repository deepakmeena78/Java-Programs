//34) WAP to check whether entered number is perfect or not
import java.util.Scanner;
class PerfectNot{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Naumber");
		int num = sc.nextInt();
		int i = 1,sum = 0;
		
		while(i < num)
		{
			if(num % i == 0)
			{
			sum = sum + i;
			}
			i++;
		}
		if(sum == num){
		System.out.println("Parfect Number");
		}
		else{
			System.out.println("Not Parfect Number");
		}
	}
}