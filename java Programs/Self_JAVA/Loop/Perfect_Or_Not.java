import java.util.Scanner;
class Perfect_Or_Not{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int a = 0;
		
		for (int i = 1;i < num;i++) {
			if (num % i == 0){
			a = a + i;
			}
		}
		if (a == num){
			System.out.println("Perfect Number");
		}
		else{
			System.out.println("Not Perfect Number");
		}
	}
}