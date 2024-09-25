import java.util.Scanner;
class Table_Of_Any{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Table Number");
		int num = sc.nextInt();

		for (int i = 1;i <= 10;i++){
			
		System.out.println(num+" * "+ i +" = "+num * i);
		}
	}
}