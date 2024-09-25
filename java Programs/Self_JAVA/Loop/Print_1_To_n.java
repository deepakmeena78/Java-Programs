import java.util.Scanner;
class Print_1_To_n{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		for (int i = 1;i <= num;i++){
			System.out.println(i+"");
		}
		
		
		
	}
}