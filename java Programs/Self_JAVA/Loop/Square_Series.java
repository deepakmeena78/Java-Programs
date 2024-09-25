import java.util.Scanner;
class Square_Series{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int a = 1;
		int sum = 0;
		
		for (int i = 1;i <= 10;i++){
			a = a * 2;
			sum = sum + a;
			System.out.println(a+"  ");
		}
		System.out.println("_____\n"+sum+"");
		
		
	}
}