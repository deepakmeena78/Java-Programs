import java.util.Scanner;
class Factorial_Series{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int a = 0;
		
		for(int i = 1;i <= num;i++){
			if (i % 2 == 0){
				System.out.println(a = a + i);
			}
			if (i % 2 != 0){
				System.out.println(a = a - i);
			}
		}
	}
}