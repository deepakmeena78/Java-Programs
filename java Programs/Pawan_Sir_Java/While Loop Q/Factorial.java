import java.util.Scanner;
class Factorial{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int i = 1,sum = 1;
		while(i <= num){
			sum = sum * i;
			i++;
		}
		System.out.println(sum);
	}
}