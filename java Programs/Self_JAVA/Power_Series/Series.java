//1 – 2 + 3 - 4 + 5 = 3
import java.util.Scanner;
class Series{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 1;i <= num;i++)
		{
			if(i % 2 != 0){
				sum = sum + i;
				System.out.print(i);
				if (num != i) 
				System.out.print("-");
			}
			else {
				sum = sum - i;
				System.out.print(i);
				if(num != i)
			    System.out.print("+");
			}
		}
		System.out.println(" = "+sum);
		 
	}
}