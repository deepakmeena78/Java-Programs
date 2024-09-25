import java.util.Scanner;
class Table_Sum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Table Number");
		int num = sc.nextInt();
		int a = 1;
		int sum = 0;

		for (int i = 1;i <= 10;i++){
			a = num * i;
			sum = sum + a;
			System.out.println(a);
		}
		System.out.println("_____\n"+sum);
	}
}