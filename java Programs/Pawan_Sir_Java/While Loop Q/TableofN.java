import java.util.Scanner;
class TableofN{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Table Number");
		int a = sc.nextInt();
		int sum = 1;
		int i = 1;
		
		while(i <= 10){
			sum = a * i;
			System.out.println(a+" * "+i+" = "+sum);
			i++;
		}
	}
}