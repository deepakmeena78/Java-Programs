import java.util.Scanner;
class Fibonacci{ 
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int i = 1,sum = 1,tem = 0;
		while(i <= num){
			tem = tem + sum;
			System.out.println(tem);
			sum = tem;
			i++;
		}
	}
}