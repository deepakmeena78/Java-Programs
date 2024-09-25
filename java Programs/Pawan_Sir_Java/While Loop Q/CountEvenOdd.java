//40) WAP to count no. Of even and odd digits in a number
import java.util.Scanner;
class CountEvenOdd{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int a = 0,b = 0,i = 1;
		while(i <= num)
		{
			if(i % 2 == 0){
				a++;
			}
			else{
				b++;
			}
		i++;
		}
		System.out.println(a+" Even "+b+" Odd ");
	}
}